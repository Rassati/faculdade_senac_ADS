import java.util.Scanner;

public class vezes {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numeros[] = new int[5];
        int numeros3[] = new int[5];
        for(int i = 0 ; i < 5 ; i++){
            System.out.println("digite o numero");
            numeros[i] = leitor.nextInt();
        }
        for(int i=0;i<5;i++){
        numeros3[i]= numeros[i]*3;
        }
        for (int i=0;i<5;i++){
            System.out.println("os numeros vezes 3 = "+numeros3[i]);

        }

    }
}
