import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Integer selecionado = -1;
        Cofrinho cofrinho = new Cofrinho();

        // Menu
        while (selecionado != 0) {
            System.out.println("COFRINHO");
            System.out.println("Digite o número para uma das opções");
            System.out.println("1 - Adicionar moeda");
            System.out.println("2 - Remover moeda");
            System.out.println("3 - Listar moeda");
            System.out.println("4 - Calcular total em reais");
            System.out.println("5 - Listar por tipo de moeda");
            System.out.println("0 - Sair");

            Scanner scanner = new Scanner(System.in);

            try{
                selecionado = scanner.nextInt();

                if (!(selecionado >= 0 && selecionado <= 5)){
                    System.out.println("Não há implementação para a opção!");
                    continue;
                }

                switch (selecionado){
                    case 1:
                        System.out.println("Digite o valor");
                        Float valorAdicao = scanner.nextFloat();

                        switch (escolherTipoMoeda()) {
                            case 1:
                                cofrinho.adicionar(new Real(valorAdicao));
                                System.out.println("Valor adicionado!");
                                break;

                            case 2:
                                cofrinho.adicionar(new Dolar(valorAdicao));
                                System.out.println("Valor adicionado!");
                                break;

                            case 3:
                                cofrinho.adicionar(new Euro(valorAdicao));
                                System.out.println("Valor adicionado!");
                                break;

                            case 0:
                                System.out.println("Voltando ao menu principal...");
                                break;
                        }
                        break;

                    case 2:
                        System.out.println("Digite o valor");
                        Float valorRemover = scanner.nextFloat();

                        switch (escolherTipoMoeda()) {
                            case 1:
                                if (cofrinho.remover(new Real(valorRemover))) System.out.println("Valor removido!");
                                else System.out.println("O valor não está no cofre e não foi removido");
                                break;

                            case 2:
                                if (cofrinho.remover(new Dolar(valorRemover))) System.out.println("Valor removido!");
                                else System.out.println("O valor não está no cofre e não foi removido");
                                break;

                            case 3:
                                if (cofrinho.remover(new Euro(valorRemover))) System.out.println("Valor removido!");
                                else System.out.println("O valor não está no cofre e não foi removido");
                                break;

                            case 0:
                                System.out.println("Voltando ao menu principal...");
                                break;
                        }
                        break;

                    case 3:
                        cofrinho.listarMoedas();
                        break;

                    case 4:
                        cofrinho.exibirTotalConvertido();
                        break;

                    case 5:
                        cofrinho.listarPorMoedas();
                        break;
                }

            } catch (Exception e){
                if (e instanceof InputMismatchException){
                    System.out.println("Valor digitado não é válido para uma opção.");
                } else {
                    System.out.println("Um erro ocorreu!");
                    System.out.println(e.toString());
                }
            } finally {
                System.out.println("");
            }
        }

        System.out.println("Encerrado...");
    }

    public static Integer escolherTipoMoeda(){
        Integer moedaSelecionada = -1;

        int[] listaTipos = {1, 2, 3};

        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Qual a moeda?");
            System.out.println("1 - Real");
            System.out.println("2 - Dólar");
            System.out.println("3 - Euro");
            System.out.println("0 - Sair");
            moedaSelecionada = scanner.nextInt();

            Integer finalMoedaSelecionada = moedaSelecionada;
            if (moedaSelecionada == 0 || IntStream.of(listaTipos).anyMatch(x -> x == finalMoedaSelecionada)) break;
        }

        return moedaSelecionada;
    }
}