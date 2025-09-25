import java.util.Scanner;

public class e7while {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int imcs = 0;
        int rep = 1;
        int imcg = 0;
        while (rep <= 10) {

            rep++;

            System.out.println("digite primeiro sua altura e depois seu peso");

            double alt = leitor.nextDouble();
            double peso = leitor.nextDouble();

            double imc = (peso/(alt*alt));

            System.out.println("seu imc é " + imc);

            if((imc >= 18.5) && (imc <= 24.9)) {
                imcs++;
            } else {
                imcg++;
            }

        }

        System.out.println("tem " + imcs +" sem obesidade");
        System.out.println("tem " + imcg + " com obesidade");

    }
}