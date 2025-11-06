
import java.util.Scanner;

public class fatoress {

    public static long calcularFatorial(int n) {
        long fatorial = 1;
        for (int i = 1; i <= n; i++) {
            fatorial *= i;
        }
        return fatorial;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        long resultado = calcularFatorial(numero);
        System.out.println("O fatorial de " + numero + " é: " + resultado);

        scanner.close();
    }
}
