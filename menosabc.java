import java.util.Scanner;

public class menosabc {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int[] numeros = new int[5];
        int[] numeros1 = new int[5];
        int[] numeros2 = new int[5];

        for(int i = 0; i<5; i++){
            System.out.println("digite 1 numero:");
            numeros[i] = leitor.nextInt();
            System.out.println("digite 1 numero novamente");
            numeros1[i] = leitor.nextInt();
        }

        for (int i = 0; i<5;i++){
            numeros2[i] = numeros[i]-numeros1[i];
        }

        for (int i = 0; i<5;i++){
            System.out.println("numero 1 menos o numero 2 = " + numeros2[i]);
        }



    }
}
