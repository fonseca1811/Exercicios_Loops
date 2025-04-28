public class exercicio04w {
    public static void main(String[] args) {
        int n1 = 0; 
        int n2 = 1; 
        int count = 0;
        int total = 10; 

        while (count < total) {
            System.out.println(n1); 
            int next = n1 + n2; 
            n1 = n2; 
            n2 = next; 
            count++; 
        }
    }
}