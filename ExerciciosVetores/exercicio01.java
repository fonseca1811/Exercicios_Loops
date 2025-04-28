public class exercicio01 {
    public static void main(String[] args) {
        int[] vetor = {1, 3, 5, 7, 9, 2, 4, 6, 8, 10};

        int soma = 0;

        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
        }

        System.out.println("A soma dos elementos do vetor é: " + soma);
    }
}
