public class Dolar extends Moeda {
    public Dolar(){}

    public Dolar(Float valor){
        super(valor);
    }

    @Override
    public void info(){
        System.out.println("Classe Dólar. O percentual de conversão de dólar para real é de 5,15. Isso significa que 1 dólar vale R$ 5,15.");
    }

    @Override
    public Float converter(Moeda moeda){
        return moeda.getValor() * 5.15f;
    }
}
