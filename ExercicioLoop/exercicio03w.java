import java.util.Scanner;

public class exercicio03w {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String senhaCorreta = "2608";
        String senhaUsuario;

        System.out.println("Por favor, insira a senha para acessar o sistema:");

        while (true) {
            senhaUsuario = scanner.nextLine();

            if (senhaUsuario.equals(senhaCorreta)) {
                System.out.println("Acesso concedido");
                break; 
            } else {
                System.out.println("Senha incorreta, tente novamente.");
            }
        }

        scanner.close();
    }
}
