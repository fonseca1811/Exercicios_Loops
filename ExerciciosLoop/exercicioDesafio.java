import java.util.Scanner;

public class exercicioDesafio {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;
        while (continuar) {
            double valorInicial = solicitarValor("Digite o valor do investimento inicial (P): ", scanner);
            double taxaJuros = solicitarValor("Digite a taxa de juros anual (r) em porcentagem: ", scanner);
            int periodoAnos = (int) solicitarValor("Digite o período de investimento em anos (t): ", scanner);
            String capitalizacao = solicitarCapitalizacao(scanner);
            double montante;
            if (capitalizacao.equalsIgnoreCase("simples")) {
                montante = calcularCapitalizacaoSimples(valorInicial, taxaJuros, periodoAnos);
            } else {
                montante = calcularCapitalizacaoComposta(valorInicial, taxaJuros, periodoAnos);
            }
            System.out.printf("O montante ao final do período é: R$ %.2f%n", montante);
            System.out.print("Deseja realizar um novo cálculo? (s/n): ");
            String resposta = scanner.nextLine().trim();
            if (!resposta.equalsIgnoreCase("s")) {
                continuar = false;
                System.out.println("Encerrando o programa. Até logo!");
            }
        }

        scanner.close();
    }
    public static double solicitarValor(String mensagem, Scanner scanner) {
        double valor;
        while (true) {
            System.out.print(mensagem);
            try {
                valor = Double.parseDouble(scanner.nextLine());
                if (valor < 0) {
                    System.out.println("Por favor, insira um valor positivo.");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Tente novamente.");
            }
        }
        return valor;
    }
    public static String solicitarCapitalizacao(Scanner scanner) {
        String opcao;
        while (true) {
            System.out.print("Escolha a capitalização (simples ou composta): ");
            opcao = scanner.nextLine().trim().toLowerCase();
            if (opcao.equals("simples") || opcao.equals("composta")) {
                break;
            } else {
                System.out.println("Opção inválida. Por favor, digite 'simples' ou 'composta'.");
            }
        }
        return opcao;
    }
    public static double calcularCapitalizacaoSimples(double P, double r, int t) {
        return P * (1 + (r / 100) * t);
    }
    public static double calcularCapitalizacaoComposta(double P, double r, int t) {
        return P * Math.pow(1 + (r / 100), t);
    }
}