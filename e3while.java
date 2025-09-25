import java.util.Scanner;

public class e3while {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        System.out.println("digite um numero");
        int n1 = leitor.nextInt();
        int bi = 1;
        while (bi <= n1 ){

                System.out.print(bi + ", ");
                bi = bi*2;

        }
    }
}
