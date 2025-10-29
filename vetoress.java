import java.util.Scanner;

public class vetoress {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int[] numeros = new int[10];


        for (int i = 0; i < 10 ; i++) {
            System.out.println("DIGITE UM NUMERO");
            numeros[i] = leitor.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.println("numeros pares " + numeros[i]);
            }
        }

        for (int i = 0; i < 10; i++) {
            if (numeros[i] % 2 != 0) {
                System.out.println("numeros impares " + numeros[i]);
            }
        }

    }
}
