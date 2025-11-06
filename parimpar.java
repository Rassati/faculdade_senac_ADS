import java.util.Scanner;

public class parimpar {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        for (int i = 0; i<5;i++) {
            System.out.println("digite um numero");
            int n1 = leitor.nextInt();
            System.out.println("o numero é par? " + par(n1));
        }
    }

    public static boolean par(int numero) {
        return (numero % 2) == 0;
    }

}
