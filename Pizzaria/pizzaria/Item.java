package pizzaria;

import java.util.ArrayList;

public class Item{
    private Pizza pizza;
    private int quantidade;

    public Item(Pizza pizza,int quantidade){
        this.pizza = pizza;
        this.quantidade = quantidade;
    }

    public Pizza getpizza(){
        return this.pizza;
    }
    public int getquantidade(){
        return this.quantidade;
    }
    public void setquantidade(int quantidade){
        this.quantidade = quantidade;
    }
    public void setpizza(Pizza pizza){
        this.pizza =pizza;
    }
    public double calcularTotal(){
        double total=0.0; 
        total+= this.pizza.getPreco()*this.quantidade;
        return total;
    }
    public String imprimirItem(){
        String DadosTotal = ""+this.pizza.imprimirPizza()+"\nQuantidade"+this.quantidade;
        return DadosTotal;
    }
}