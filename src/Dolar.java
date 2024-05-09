public class Dolar extends Moeda {
    public Dolar(){}

    public Dolar(Float valor){
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
        if (moeda instanceof Euro){
            // Taxa de conversão Dolar para Euro
            resultado = moeda.valor * 0.93f;
        } else if (moeda instanceof Real){
            // Taxa de conversão Dolar para Real
            resultado = moeda.valor * 0.18f;
        }
        addTotalConvertido(resultado);
        return resultado;
    }
}
