import java.util.Scanner;

public class repeticaowhile {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        System.out.println("digite um numero");
        int n1 = 0;
        while (n1 <= 10){
            int resto = n1 % 2;

        if (resto == 0) {

            System.out.println("o numero " + n1 + " e par");
        }

        n1++;
        }



    }
}
