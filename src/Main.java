public class Main {
    public static void main(String[] args) {
        Cofrinho cofrinho = new Cofrinho();

        cofrinho.adicionar(new Dolar(5.0f));
        cofrinho.adicionar(new Euro(2.0f));
        cofrinho.adicionar(new Euro(2.0f));

        cofrinho.listagemPorMoedas();
        cofrinho.listagemMoedas();
        cofrinho.totalConvertido();
    }
}