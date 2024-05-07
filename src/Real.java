public class Real extends Moeda {
    public Real(Double valor){
        super(valor);
    }

    @Override
    public void info(){
        // Verificar o que o método deve fazer
    }

    @Override
    public Double converter(Moeda moeda){
        // A conversão varia de moeda para moeda
        if (moeda instanceof Dolar){
            // Taxa de conversão Real para Dolar
        } else if (moeda instanceof Euro){
            // Taxa de conversão Real para Euro
        }
        return 0d;
    }
}