public class Euro extends Moeda {
    public Euro(){}

    public Euro(Float valor){
        super(valor);
    }

    @Override
    public void info(){
        System.out.println("Classe Euro. O percentual de conversão de dólar para real é de 5,55. Isso significa que 1 euro vale R$ 5,55.");
    }

    @Override
    public Float converter(Moeda moeda){
        return moeda.getValor() * 5.55f;
    }
}
