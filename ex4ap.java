
import java.util.Scanner;
public class ex4ap {
public static void main(String[] args){

    Scanner leitor = new Scanner(System.in);
    
    int N1, N2, N3, N4, Soma;

    System.out.println("Digite 4 numeros inteiros para calcular a Soma entre eles.");

    N1 = leitor.nextInt();
    N2 = leitor.nextInt();
    N3 = leitor.nextInt();
    N4 = leitor.nextInt();

    Soma = (N1+N2+N3+N4);

    System.out.println("A Soma é: " + Soma);
    
        }



}
