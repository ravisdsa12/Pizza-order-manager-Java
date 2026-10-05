package Controle;

import java.util.ArrayList;
import pizzaria.Pizza;
import pizzaria.Tamanho;

public class ControlePizza{
    private ArrayList<Pizza> pizzas = new ArrayList<>();

    public void cadastrarPizza(int codigo,String sabor,
    Tamanho tamanho,double preco){
        Pizza pizza = new Pizza(codigo,sabor,preco,tamanho);
        
        pizzas.add(pizza);

    }
    public Pizza pesquisarPizza(int codigo){

        for(Pizza pizza : pizzas){
            if(pizza.getCodigo() == codigo){
                return pizza;
            }
        }
        return null;
    }
}