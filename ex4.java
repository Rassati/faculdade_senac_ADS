
import java.util.Scanner;



public class ex4 {
    public static void main (String[] args) {
   // code here.
    float n1, n2;
    Scanner leitor = new Scanner(System.in);
        System.out.println("digite dois numeros");

        n1 = leitor.nextFloat();
        n2 = leitor.nextFloat();

        if(n1>n2){

            System.out.println(n1 + "\n" + n2);


        }

        else{

            System.out.println(n2 + "\n" + n1);



        }






    }



}
