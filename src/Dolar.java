public class Dolar extends Moeda {
    public Dolar(Double valor){
        super(valor);
    }

    @Override
    public void info(){
        // Verificar o que o método deve fazer
    }

    @Override
    public Double converter(Moeda moeda){
        // A conversão varia de moeda para moeda
        if (moeda instanceof Euro){
            // Taxa de conversão Dolar para Euro
        } else if (moeda instanceof Real){
            // Taxa de conversão Dolar para Real
        }
        return 0d;
    }
}
