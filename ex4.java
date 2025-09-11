import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite seu plano de trabalho");
        System.out.println("plano A,B ou C");
        String plano = leitor.next().toUpperCase();
        System.out.println("qual seu salario?");
        int salario = leitor.nextInt();

        switch (plano){
            case ("A"):
                System.out.printf("Aumento de 10%");
                double salarioA = (salario + (salario * 0.1));
                System.out.printf("novo valor %.2f%n", salarioA);
                break;
            case ("B"):
                System.out.println("Aumento de 15%");
                double salarioB = (salario + (salario*0.15));
                System.out.printf("novo valor %.2f%n", salarioB);
                break;
            case ("C"):
                System.out.println("aumento de 20%");
                double salarioC = (salario + (salario*0.20));
                System.out.printf("novo valor %.2f%n", salarioC);
                break;
            default:
                System.out.println("plano invalido");
                break;
        }
    }
}
