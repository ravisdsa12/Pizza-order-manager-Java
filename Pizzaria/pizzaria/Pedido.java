package pizzaria;

import java.util.ArrayList;

public class Pedido{
    private ArrayList<Item> itens;
    private String data;
    private int codigoPedido;

    public Pedido(String data,int codigoPedido){
        this.data = data;
        this.codigoPedido = codigoPedido;
        this.itens = new ArrayList<>();
    }
    public void adicionarItem(Item item){
        this.itens.add(item);
    }
    public double CalcularTotalPedido(){
        double totalFinal=0.0;

        for(Item item : itens){
            totalFinal += item.calcularTotal();
        }
        return totalFinal;
    }

    public String imprimirPedido() {
    String dadosPedido = "Código do Pedido: " + codigoPedido + "\n";
    dadosPedido += "Data: " + data + "\n";
    dadosPedido += "--- Itens do Pedido ---\n";

    
    for (Item item : itens) {
        dadosPedido += item.imprimirItem() + "\n";
    }

    dadosPedido += "-----------------------\n";
    dadosPedido += "Valor Total: R$ " + CalcularTotalPedido();

    return dadosPedido;
}
}