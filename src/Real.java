public class Real extends Moeda {
    public Real(){}

    public Real(Float valor) {
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
            // Taxa de conversão Real para Dolar
            resultado = moeda.valor * 5.16f;
        } else if (moeda instanceof Euro){
            // Taxa de conversão Real para Euro
            resultado = moeda.valor * 5.55f;
        }
        addTotalConvertido(resultado);
        return resultado;
    }
}