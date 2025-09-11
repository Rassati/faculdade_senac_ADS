

import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("digite 2 numeros ");
        double n1 = leitor.nextDouble();
        double n2 = leitor.nextDouble();

        System.out.println("Digite a operação (+, -, *, /): ");
        char opera = leitor.next().charAt(0);

        double result;

        if (opera == '+') {
            result = n1 + n2;
            System.out.println("deu " + result);
        } else if (opera == '-') {
            result = n1 - n2;
            System.out.println("deu " + result);
        } else if (opera == '*') {
            result = n1 * n2;
            System.out.println("deu " + result);
        } else if (opera == '/') {
            if (n2 <= 0) {
                System.out.println("invalido");
            } else {
                result = n1 / n2;
                System.out.println("deu " + result);
            }
        } else {
            System.out.println("invalido");
        }
    }
}

