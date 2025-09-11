import java.util.Scanner;

public class ex9 {
    public static void main(String[] args){

        Scanner leitor = new Scanner(System.in);
        System.out.println("qual seu salario bruto?");
        int sal = leitor.nextInt();
        System.out.println("qual valor da prestaçao?");
        int prest = leitor.nextInt();

        if(prest<(sal*0.3)) {

            System.out.println("APROVADO");
        } else {
            System.out.println("NEGADO ");
        }

    }
}
