package pizzaria;

public enum Tamanho{
    PEQUENA(10),
    MEDIA(15),
    GRANDE(20),
    FAMILIA(25);

    private final int tempoForno;

    Tamanho(int tempoForno){
        this.tempoForno = tempoForno;
    }
    public int gettempoForno(){
        return this.tempoForno;
    }
}