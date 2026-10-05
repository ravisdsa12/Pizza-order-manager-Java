package App;


import pizzaria.Pizza;
import pizzaria.Tamanho;
import javax.swing.JOptionPane;
 
public class Teste{
    public static void main(String[] args){
        Pizza pizza1 = new Pizza(1,"Queijo",25.50,Tamanho.GRANDE);
        Pizza pizza2 = new Pizza(2,"Frango",25.50,Tamanho.MEDIA);
        JOptionPane.showMessageDialog(null,pizza1.imprimirPizza()+"\n"+pizza2.imprimirPizza());
        
    }
}
