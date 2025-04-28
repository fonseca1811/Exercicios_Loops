import java.util.Scanner;

public class exerciciodw02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Menu:");
            System.out.println("1. Adicionar");
            System.out.println("2. Removedor");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Ação de Adicionar realizada com sucesso!");
                    break;
                case 2:
                    System.out.println("Ação de Removedor realizada com sucesso!");
                    break;
                case 3:
                    System.out.println("Encerrando o programa. Até logo!");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, tente novamente.");
            }

            System.out.println(); 
    
        } while (opcao != 3);

        scanner.close();
    }
}

