import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite dois numeros");
        double num1 = leitor.nextDouble();
        double num2 = leitor.nextDouble();

        System.out.println("Escolha uma das operaçoes");
        System.out.println("M para media entre os numeros digitados");
        System.out.println("S para diferença entre eles");
        System.out.println("P para produto entre os numeros digitados");
        System.out.println("D para divisao do primeiro pelo segundo");
        String OP = leitor.next().toUpperCase();

        switch (OP){
            case ("M"):
                System.out.println("A media entre eles");
                double media = ((num2+num1)/2);
                System.out.printf("A media é %.2f %n", media);
                break;
            case ("S"):
                System.out.println("a diferença entre eles");
                double dif = Math.abs(num1-num2);
                System.out.printf("A diferença é %.2f %n", dif);
                break;
            case ("P"):
                System.out.println("o produto entre eles");
                double produto = (num1*num2);
                System.out.printf("o produto é %.2f %n", produto);
                break;
            case ("D"):
                System.out.println("a divisao entre eles");
                double  div = (num1/num2);
                System.out.printf("a divisao é %.2f %n", div);
                break;
            default:
                System.out.println("Opcao invalida");
        }
    }
}
