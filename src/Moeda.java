import java.util.ArrayList;

public abstract class Moeda {
    protected Float valor;
    static ArrayList<Float> totalConvertido = new ArrayList<Float>();

    public Moeda(){}

    public Moeda(Float valor){
        this.valor = valor;
    }

    public Float getValor(){
        return this.valor;
    }

    public void setValor(Float valor){
        this.valor = valor;
    }

    public void info(){
        // Verificar o que o método deve fazer
    }

    // Método abstrato para ser sobrescrevido
    public abstract Float converter(Moeda moeda);

    public Float getTotalConvertido(){
        Float total = 0f;
        for (Float valor : this.totalConvertido) {
            total += valor;
        };
        return total;
    }

    public void addTotalConvertido(Float valor){
        this.totalConvertido.add(valor);
    }
}
