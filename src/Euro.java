public class Euro extends Moeda {
    public Euro(Double valor){
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
            // Taxa de conversão Euro para Dolar
        } else if (moeda instanceof Real){
            // Taxa de conversão Euro para Real
        }
        return 0d;
    }
}
