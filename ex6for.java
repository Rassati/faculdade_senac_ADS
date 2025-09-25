import java.util.Scanner;

public class ex6for {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int[] candidatos = new int[4];
        int nulo = 0, branco = 0;

        for (int i = 0; i < 10; i++) {
            int voto = leitor.nextInt();
            if (voto >= 1 && voto <= 4) {
                candidatos[voto - 1]++;
            } else if (voto == 5) {
                nulo++;
            } else if (voto == 6) {
                branco++;
            }
        }

        for (int i = 0; i < 4; i++) {
            System.out.println("Candidato " + (i + 1) + ": " + candidatos[i] + " votos");
        }
        System.out.println("Votos nulos: " + nulo);
        System.out.println("Votos em branco: " + branco);

        double percentualNuloBranco = ((double)(nulo + branco) / 10) * 100;
        System.out.println("Percentual de votos nulos e brancos: " + percentualNuloBranco + "%");
    }
}

