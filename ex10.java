import java.util.Scanner;

public class ex10 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite 3 numeros inteiros");
        int n1 = leitor.nextInt();
        int n2 = leitor.nextInt();
        int n3 = leitor.nextInt();

        if(n1 == n2 && n3 == n1){
            System.out.println("os tres numeros sao iguais");
        } else {
            int maior = Math.max(n1, Math.max(n2, n3));
            System.out.println("o maior é "+ maior);
        }











    }
}
