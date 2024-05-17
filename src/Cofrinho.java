import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Class Cofrinho possui métodos responsáveis por adicionar, calcular o total e visualizar os valores armazenados
 *  @author  Gabriel
 */
public class Cofrinho {
    // Lista em que as moedas serão adicionadas
    private final ArrayList<Moeda> listaMoedas = new ArrayList<>();

    public Cofrinho(){}

    // Método para adicionar uma moeda a lista listaMoedas
    public void adicionar(Moeda moeda){
        this.listaMoedas.add(moeda);
        // Retorna true para a verificação de sucesso
    }

    // Método para remover uma moeda ao array listaMoedas
    public Boolean remover(Moeda moeda){
        // Percorrendo o ArrayList para verificar...
        for (Moeda moedaArmazenada : this.listaMoedas){
            // Se existe moeda com o mesmo valor que a que se deseja remover
            if (moedaArmazenada.getValor().equals(moeda.getValor())){
                // E se ambas são do mesmo tipo
                if ((moedaArmazenada instanceof Real && moeda instanceof Real) || (moedaArmazenada instanceof Dolar && moeda instanceof Dolar) || (moedaArmazenada instanceof Euro && moeda instanceof Euro)){
                    this.listaMoedas.remove(moedaArmazenada);
                    return true;
                }
            }
        }
        return false;
    }

    // Lista moeda pelo que foi armazenado no ArrayList
    public void listarMoedas(){
        System.out.println("Listagem de Moedas:");
        for (Moeda moeda : this.listaMoedas) {
            // Verifica se o objeto é instância de alguma das moedas e imprime o valor
            // Usando a class DecimalFormat e o método format para exibir até 3 casas decimais
            if (moeda instanceof Real) {
                System.out.println("REAL: " + new DecimalFormat().format(moeda.getValor()));
            } else if (moeda instanceof Euro) {
                System.out.println("EURO: " + new DecimalFormat().format(moeda.getValor()));
            } else if (moeda instanceof Dolar) {
                System.out.println("DÓLAR: " + new DecimalFormat().format(moeda.getValor()));
            }
        }

        if (this.listaMoedas.isEmpty()) {
            System.out.println("Não há valores armazenados!");
        }
    }

    // Lista e soma por tipo de moeda armazenada no ArrayList
    public void listarPorMoedas(){
        System.out.println("Listagem por tipo de Moeda:");
        Map<String, Double> totais = new HashMap<>();
        for (Moeda moeda : this.listaMoedas){
            String moedaVez = "";
            if (moeda instanceof Real) {
                moedaVez = "Real";
            } else if (moeda instanceof  Euro) {
                moedaVez = "Euro";
            } else if (moeda instanceof Dolar) {
                moedaVez = "Dolar";
            }

            if (totais.get(moedaVez) != null){
                totais.put(moedaVez, totais.get(moedaVez) + moeda.getValor());
            } else {
                totais.put(moedaVez, moeda.getValor());
            }
        }

        // Imprimindo o total armazenado por cada um dos tipo de Moedas
        // Limita a impressão de até duas casas decimais e verifica se existe valor para as chaves
        // Se não houver, imprime 0.0 para evitar exibição de null ou erro
        System.out.printf("REAL: %.2f - ", totais.get("Real") != null ? totais.get("Real") : 0.0f);
        System.out.printf("EURO: %.2f - ", totais.get("Euro") != null ? totais.get("Euro") : 0.0f);
        System.out.printf("DÓLAR: %.2f \n", totais.get("Dolar") != null ? totais.get("Dolar") : 0.0f);
    }

    // Método que calcula e retorna o total do que foi convertido
    public void exibirTotalConvertido(){
        Float total = 0f;
        // Percorre a lista usando o foreach do Java
        for (Moeda moeda : this.listaMoedas){
            // Incrementa a variável total com a moeda e faz a conversão se a moeda for euro ou dólar para o valor equivalente em real
            total += new Real().converter(moeda);
        }

        // Limita a impressão de até duas casas decimais
        System.out.printf("O total convertido foi de R$ %.2f\n", total);
    }
}
