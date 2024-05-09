public class Euro extends Moeda {
    public Euro(){}

    public Euro(Float valor){
        super(valor);
    }

    @Override
    public void info(){
        // Verificar o que o método deve fazer
    }

    @Override
    public Float converter(Moeda moeda){
        Float resultado = 0f;
        // A conversão varia de moeda para moeda
        if (moeda instanceof Dolar){
            // Taxa de conversão Euro para Dolar
            resultado = moeda.valor * 1.08f;
        } else if (moeda instanceof Real){
            // Taxa de conversão Euro para Real
            resultado = moeda.valor * 0.19f;
        }
        addTotalConvertido(resultado);
        return resultado;
    }
}
