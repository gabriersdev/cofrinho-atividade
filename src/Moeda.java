public abstract class Moeda {
    protected Float valor;

    public Moeda(){}

    public Moeda(Float valor){
        this.valor = valor;
    }

    public Float getValor(){
        return this.valor;
    }

    public abstract void info();

    // Método abstrato para ser sobrescrevido
    public abstract Float converter(Moeda moeda);
}
