import java.util.Scanner;

public class nomes {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        String[] nomes = new String[5];

        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Digite o nome da pessoa ");
            nomes[i] = leitor.nextLine();
        }

        System.out.println("Nomes do ultimo para o primeiro:");
        for (int i = nomes.length - 1; i >= 0; i--) {
            System.out.println(nomes[i]);
        }

        System.out.println("Primeiro nome armazenado: " + nomes[0]);
        System.out.println("Ultimo nome armazenado: " + nomes[nomes.length - 1]);

    }
}
