import java.util.Scanner;

public class juntar {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int[] numeros = new int[4];
        int[] numeros1 = new int[6];
        int[] numeros2 = new int[10];

        for(int i = 0; i<4; i++){
            System.out.println("digite 1 numero:");
            numeros[i] = leitor.nextInt();
        }

        for(int i = 0; i<6; i++){
            System.out.println("digite 2 numero:");
            numeros1[i] = leitor.nextInt();
        }


        for (int i = 0;i<4; i++){

            numeros2[i] += numeros[i];

        }

        for (int i = 0;i<6; i++){

            numeros2[4+i] += numeros1[i];

        }

        for (int i = 0;i<10; i++){

            System.out.println("numeros juntos "+ numeros2[i] + " numero que foi digitado em " + i);

        }




    }
}
