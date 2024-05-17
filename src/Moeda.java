public abstract class Moeda {
    protected Double valor;

    public Moeda(){}

    public Moeda(Double valor){
        this.valor = valor;
    }

    public Double getValor(){
        return this.valor;
    }

    public abstract void info();

    // Método abstrato para ser sobrescrevido
    public abstract Double converter(Moeda moeda);
}
