public class Real extends Moeda {
    public Real(){}

    public Real(Double valor) {
        super(valor);
    }

    @Override
    public void info(){
        System.out.println("Classe Real. Pode converter real para euro (1 euro equivale a R$ 5,55) ou dólar (1 dólar equivale a R$ 5,15).");
    }

    @Override
    public Double converter(Moeda moeda){
        Double resultado;
        // A conversão varia de moeda para moeda
        if (moeda instanceof Dolar){
            // Taxa de conversão Real para Dolar
            resultado = moeda.getValor() * 5.15d;
        } else if (moeda instanceof Euro){
            // Taxa de conversão Real para Euro
            resultado = moeda.getValor() * 5.55d;
        } else {
            resultado = moeda.getValor() * 1d;
        }
        return resultado;
    }
}