package pizzaria;

public class Pizza{
    private int codigo;
    private String sabor;
    private double preco;
    private Tamanho tamanho;

    public Pizza(int codigo,String sabor,double preco,Tamanho tamanho){
        this.codigo = codigo;
        this.sabor = sabor;
        this.preco = preco;
        this.tamanho = tamanho;
    }
    public int getCodigo(){
        return this.codigo;
    }
    public String getSabor(){
        return this.sabor;
    }
    public double getPreco(){
        return this.preco;
    }
    public Tamanho gettamanho(){
        return this.tamanho;
    }
    public String imprimirPizza(){
        String dadosPizza = "" + tamanho +"\n"+tamanho.gettempoForno()+ "\n"+sabor+"\n"+codigo;
        return dadosPizza;
    }
}