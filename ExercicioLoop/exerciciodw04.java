import java.util.Scanner;

public class exerciciodw04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double somaNotas = 0;
        int quantidadeNotas = 0;
        String resposta;

        do {
            System.out.print("Digite a nota do aluno (0 a 10): ");
            double nota = scanner.nextDouble();


            while (nota < 0 || nota > 10) {
                System.out.print("Nota inválida. Digite uma nota entre 0 e 10: ");
                nota = scanner.nextDouble();
            }

            somaNotas += nota;
            quantidadeNotas++;

            System.out.print("Deseja inserir outra nota? (s/n): ");
            resposta = scanner.next();

        } while (resposta.equalsIgnoreCase("s"));

        if (quantidadeNotas > 0) {
            double media = somaNotas / quantidadeNotas;
            System.out.println("A média das notas inseridas é: " + media);
        } else {
            System.out.println("Nenhuma nota foi inserida.");
        }

        scanner.close();
    }
}
