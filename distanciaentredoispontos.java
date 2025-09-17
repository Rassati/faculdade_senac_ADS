import java.util.Scanner;

public class distanciaentredoispontos {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        double n1 = leitor.nextDouble();
         double n2 = leitor.nextDouble();
          double n3 = leitor.nextDouble();
           double n4 = leitor.nextDouble();

        double distancia = Math.sqrt(Math.pow(n3 - n1, 2)+ Math.pow(n4 - n2, 2));

        System.out.printf("%.4f%n", distancia);


    }   
}
