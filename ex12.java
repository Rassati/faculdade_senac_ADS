
import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o salário: R$ ");
        double sal = leitor.nextDouble();
        double desc;

        if (sal <= 600.00) {
            desc = 0.0;
        } else if (sal <= 1200.00) {
            desc = sal * 0.2;
        } else if (sal <= 2000.00) {
            desc = sal * 0.25;
        } else {
            desc = sal * 0.3;
        }

        System.out.printf("desconto do INSS %.2f\n", desc);
    }
}
