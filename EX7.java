
import java.util.Scanner;

public class EX7 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        System.out.println("qual seu salario?");
        double sal = leitor.nextDouble();
        System.out.println("quantos anos esta na empresa?");
        int ano = leitor.nextInt();


        if(ano>=5){
            double saln = (sal+(sal*0.2));
            System.out.println("com o aumento de 20% seu salario é "+ saln);
        }   else {

            double saln1 = (sal+(sal*0.1));
            System.out.println("com o aumento de 10% seu salario é " + saln1);

        }






    }
}
