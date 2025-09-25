import java.util.Scanner;

public class ex3for {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int i;

        System.out.println("Digite um numero inteiro");
        int n1 = leitor.nextInt();

        System.out.println("sequencia começando do 1");

        for (i = 1; i <= n1; i++) {

            System.out.println(i);

        }
    }
}
