import java.util.Scanner;

public class ex8while {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int rep = 1;
        double nota1;
        double nota2;
        double media;
        while (rep <= 5 ){

            do{
                System.out.println("digite a nota 1 (somente valores de 0 a 10)");
                nota1 = leitor.nextDouble();
                if (nota1 < 0 || nota1 > 10){
                    System.out.println("nota errada tente novamente");
                }
            }while ((nota1 < 0 || nota1 > 10));

            do{
                System.out.println("digite a nota 2 (somente valores de 0 a 10)");
                nota2 = leitor.nextDouble();
                if (nota2 < 0 || nota2 > 10){
                    System.out.println("nota errada tente novamente");
                }
            }while ((nota2 < 0 || nota2 > 10));

            media = (nota1+nota2) / 2.0;

            System.out.printf("A media do aluno %d é: %.2f%n",rep, media);
        }

    }
}
