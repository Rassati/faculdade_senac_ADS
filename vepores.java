public class vepores {

    public static int maiorValor(int[] vetor) {
        int maior = vetor[0];
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
        }
        return maior;
    }

    public static int menorValor(int[] vetor) {
        int menor = vetor[0];
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] < menor) {
                menor = vetor[i];
            }
        }
        return menor;
    }

    public static double mediaMaxMin(int[] vetor) {
        int max = maiorValor(vetor);
        int min = menorValor(vetor);
        return (max + min) / 2.0;
    }

    public static void main(String[] args) {
        int[] numeros = {10, 5, 20, 3, 15};

        System.out.println("Maior valor: " + maiorValor(numeros));
        System.out.println("Menor valor: " + menorValor(numeros));
        System.out.println("Média: " + mediaMaxMin(numeros));
    }
}

