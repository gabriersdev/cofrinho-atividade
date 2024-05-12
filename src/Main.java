import java.util.InputMismatchException;
import java.util.Scanner;

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
                        // TODO - Possibilitar a escolha da moeda
                        break;

                    case 2:
                        // TODO - Verificação do valor e não objeto
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
}