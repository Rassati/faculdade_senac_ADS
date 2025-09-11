//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("DIGITE UM NUMERO");
        int pontos = leitor.nextInt();
        if (pontos>20){
            int div = (pontos/2);
            System.out.println("toma a metade dele ai " + div );
            System.exit(0);
        }
        System.out.println("muito baixo ");
    }
}