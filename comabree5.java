import java.util.Scanner;



public class comabree5 {
         public static void main(String[] args) {
            Double N1,N2, MEDIA, N12, N22;
           Scanner leitor=new Scanner(System.in);

           N1 = leitor.nextDouble();
           N2 = leitor.nextDouble();
           
           
           N12 = (N1 * 3.5);
           N22 = (N2 * 7.5);

            MEDIA = ((N12 + N22) / 11);

            System.out.printf("MEDIA = %.5f%n" , MEDIA);


         
        }
}
