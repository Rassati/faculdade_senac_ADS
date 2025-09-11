//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class maiordeidade {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Qual sua idade?");
        int numero = leitor.nextInt();
        if (numero>18){
            System.out.println("voce é maior de idade ");
            System.exit(0);
        }
        else {
            System.out.println("voce é menor de idade");
        }
        leitor.close();
    }
}