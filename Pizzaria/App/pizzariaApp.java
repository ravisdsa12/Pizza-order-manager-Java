package App;

import javax.swing.JOptionPane;
import Controle.ControlePizza;
import pizzaria.Tamanho;
import pizzaria.Pedido;
import pizzaria.Item;
import pizzaria.Pizza;

public class pizzariaApp{  
    
    public static String Menu(){
        return "digite:\n" +
        "1-Cadastrar pizza\n"+
        "2-Cadastrar pedido\n"+
        "3-Listar pedido\n"+
        "0-Para sair";
    }


    public static void main(String[] args){
        ControlePizza controlePizza = new ControlePizza();

        int numero = 0;

        Pedido pedido=null;

        do{ 
            String decisao = JOptionPane.showInputDialog(Menu());

            numero = Integer.parseInt(decisao);

           

            if (numero == 1){
                String codigoPizza = JOptionPane.showInputDialog("Informe o Código da pizza :");
                int codigoInt = Integer.parseInt(codigoPizza);

                String saborPizza = JOptionPane.showInputDialog("Informe o Sabor da pizza :");

                String precoPizza = JOptionPane.showInputDialog("Informe o Preço da pizza :");
                double precoDouble = Double.parseDouble(precoPizza);
            
                String tamanhoPizza = JOptionPane.showInputDialog("Informe o tamanho da pizza :"+
                    "\n1 → Tamanho PEQUENA"+
                    "\n2 → Tamanho MEDIA"+
                    "\n3 → Tamanho GRANDE"+
                    "\n4 → Tamanho FAMILIA");

                int tamanhoInt = Integer.parseInt(tamanhoPizza);

                if(tamanhoInt == 1){
                    controlePizza.cadastrarPizza(codigoInt,saborPizza,Tamanho.PEQUENA,precoDouble);
                }
                else if(tamanhoInt == 2){
                    controlePizza.cadastrarPizza(codigoInt,saborPizza,Tamanho.MEDIA,precoDouble);
                }
                else if(tamanhoInt == 3){
                    controlePizza.cadastrarPizza(codigoInt,saborPizza,Tamanho.GRANDE,precoDouble);
                }
                else if(tamanhoInt == 4){
                    controlePizza.cadastrarPizza(codigoInt,saborPizza,Tamanho.FAMILIA,precoDouble);
                }
            }

            else if(numero == 2){
                String dataPedido = JOptionPane.showInputDialog("Digite a data do pedido :");
            
                String codigoDoPedido = JOptionPane.showInputDialog("Digite o codigo do pedido :");
                int codigoInt = Integer.parseInt(codigoDoPedido);

                pedido = new Pedido(dataPedido,codigoInt);

                int resposta = JOptionPane.showConfirmDialog(null,"Deseja adicionar uma pizza ao pedido? ");
                while (resposta == 0){
                    String codigoDaPizza = JOptionPane.showInputDialog("Digite o codigo da pizza :");
                    int codigoPizzaInt = Integer.parseInt(codigoDaPizza);
                
                    Pizza pizzaEncontrada = controlePizza.pesquisarPizza(codigoPizzaInt);

                    String quantidadePizza = JOptionPane.showInputDialog("Digite a quantidade desta pizza ");
                    int quantidadeInt= Integer.parseInt(quantidadePizza);
                
                    if(pizzaEncontrada!= null){
                    
                        Item item = new Item(pizzaEncontrada,quantidadeInt);

                        pedido.adicionarItem(item);
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"Pizza não encontrada!");
                    }
                    resposta = JOptionPane.showConfirmDialog(null,"Deseja adicionar mais uma pizza ao pedido? ");
                }
                JOptionPane.showMessageDialog(null,"Valor total do pedido : "+pedido.CalcularTotalPedido());
            }
            else if(numero == 3){
                JOptionPane.showMessageDialog(null,pedido.imprimirPedido());
            }
            else if (numero == 0){
                break;
            }
            else {
                JOptionPane.showMessageDialog(null,"Opçao incorreta tente novamente!");
            }
 
        }while(numero!=0);
    }

}
