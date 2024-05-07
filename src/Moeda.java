public abstract class Moeda {
    protected Double valor;

    public Moeda(Double valor){
        this.valor = valor;
    }

    public Double getValor(){
        return this.valor;
    }

    public void setValor(Double valor){
        this.valor = valor;
    }

    public void info(){
        // Verificar o que o método deve fazer
    }

    // Método abstrato para ser sobrescrevido
    public abstract Double converter(Moeda moeda);
}
