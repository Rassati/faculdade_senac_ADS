import java.util.Scanner;



public class comabree6 {
            public static void main(String[] args) {
                double N1, N2, N3, MEDIA,P1,P2,P3;
                Scanner leitor=new Scanner(System.in);

                N1 = leitor.nextDouble();
                N2 = leitor.nextDouble();
                N3 = leitor.nextDouble();

                P1 = (N1*2);
                P2 = (N2*3);
                P3 = (N3*5);

                MEDIA = ( (P1+P2+P3) / 10);

                System.out.printf("MEDIA = %.1f%n", MEDIA);



      }
}
