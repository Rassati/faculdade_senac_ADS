
import java.util.Random;

public class aleatorios {
    public static void main(String[] args) {
        Random sorteio = new Random();
        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = sorteio.nextInt(10) + 1;
        }


        System.out.println("Numeros sorteados:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }


        int menor = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        System.out.println("Menor numero sorteado: " + menor);
    }
}

