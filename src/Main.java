public class Main {
    public static void main(String[] args) {
        Dolar moedaDolar = new Dolar(100f);
        System.out.println(moedaDolar.converter(new Real(10f)));
    }
}