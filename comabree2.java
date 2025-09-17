import java.util.Scanner;

public class comabree2 {
    public static void main(String[] args) {
        double area,n,raio;
        Scanner leitor=new Scanner(System.in);

        raio = leitor.nextDouble();

        n = 3.14159;

        area = n*(raio*raio);

        System.out.printf("A=%.4f%n" , area);
        
    
    }

}