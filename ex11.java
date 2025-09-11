import java.util.Scanner;

public class ex11 {
    public static void main(String[] args){

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a idade do nadador: ");
        int idade = leitor.nextInt();


        if (idade >= 5 && idade <= 7) {
            System.out.println("INFANTIL A");
        } else if (idade >= 8 && idade <= 10) {
            System.out.println("INFANTIL B");
        } else if (idade >= 11 && idade <= 13) {
            System.out.println("JUVENIL A");
        } else if (idade >= 14 && idade <= 17) {
            System.out.println("JUVENIL B");
        } else if (idade >= 18) {
            System.out.println("SENIOR");
        } else {
            System.out.println("menor que 5 anos invalido");
        }


    }
}
