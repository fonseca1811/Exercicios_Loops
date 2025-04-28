import java.util.Scanner;

public class exercicio02w {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma = 0;
        int numero;

        System.out.println("Digite números positivos para somar. Para encerrar, digite um número negativo.");

        do {
            System.out.print("Digite um número: ");
            numero = scanner.nextInt();

            if (numero >= 0) {
                soma += numero;
            }
        } while (numero >= 0);

        System.out.println("A soma dos números positivos é: " + soma);
        scanner.close();
    }
}

