public class Real extends Moeda {
    public Real(){}

    public Real(Float valor) {
        super(valor);
    }

    @Override
    public void info(){
        System.out.println("Classe Real. Pode converter real para euro (1 euro equivale a R$ 5,55) ou dólar (1 dólar equivale a R$ 5,15).");
    }

    @Override
    public Float converter(Moeda moeda){
        Float resultado = 0f;
        // A conversão varia de moeda para moeda
        if (moeda instanceof Dolar){
            // Taxa de conversão Real para Dolar
            resultado = moeda.getValor() * 5.15f;
        } else if (moeda instanceof Euro){
            // Taxa de conversão Real para Euro
            resultado = moeda.getValor() * 5.55f;
        } else {
            resultado = moeda.getValor() * 1f;
        }
        return resultado;
    }
}