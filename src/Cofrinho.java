import java.util.ArrayList;

public class Cofrinho {
    // Lista em que as moedas serão adicionadas
    private ArrayList<Double> listaMoedas = new ArrayList<Double>();

    // Método para adicionar uma moeda a lista listaMoedas
    public Boolean adicionar(Double Moeda){
        this.listaMoedas.add(Moeda);
        // Retorna true para a verificação de sucesso
        return true;
    }

    // Método para remover uma moeda ao array listaMoedas
    public Boolean remover(Double Moeda){
        // Verifica se a moeda que se quer remover existe na lista
        if (this.listaMoedas.contains(Moeda)){
            this.listaMoedas.remove(Moeda);
            // Retorna true para a verificação de sucesso
            return true;
        } else {
            // Retorna false caso a lista de moedas não contenha a Moeda que se desejou remover
            return false;
        }
    }

    public ArrayList listagemMoedas(){
        return this.listaMoedas;
    }

    // Método que calcula e retorna o total do que foi convertido
    public Double totalConvertido(){
        Double total = 0d;

        // Percorre a lista usando o foreach do Java
        for (Double moeda : this.listaMoedas){
            // Incrementa a variável total com a moeda
            total += moeda;
        }

        return total;
    }
}
