
import java.util.Scanner;

public class ex6 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        System.out.println("digite H para Homem \n digite M para mulher");
        String sexo = leitor.nextLine().toUpperCase();

       System.out.println("digite a altura em metros (1.70)");
        double alt = leitor.nextDouble();

        double pi;
        if(sexo.equals("H")){
            pi = (72.7 * alt) - 58;

        } else if (sexo.equals("M")) {
             pi = (62.1 * alt) - 44.7;

        } else {
            System.out.println("Sexo inválido.");
            return;
        }

            System.out.printf("o peso ideal é %.2f%n" , pi);

    }
}
