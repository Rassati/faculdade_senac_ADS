import java.util.Scanner;

public class ex5for {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double nota1, nota2, media, mediaclasse = 0, mediaclasseconta;
        int i, aprovados = 0, exame = 0, reprovados = 0;

        for (i = 1;i<=10;i++){

            System.out.println("digite sua 1 nota");
            nota1 = leitor.nextDouble();
            System.out.println("digite sua 2 nota");
            nota2 = leitor.nextDouble();

            media = ((nota1+nota2)/ 2.0);

            System.out.printf("Sua media foi %.2f%n", media);

            if (media <= 3){
                reprovados++;
                System.out.println("voce foi REPROVADO");
            }
            if (media > 3 && media < 7){
                exame++;
                System.out.println("VOCE ESTA DE EXAME");
            }
            if (media > 7){
                aprovados++;
                System.out.println("VOCE FOI APROVADO");
            }

            mediaclasse += media;

        }

        System.out.println("TOTAL DE APROVADOS "+ aprovados);
        System.out.println("TOTAL DE REPROVADOS "+ reprovados);
        System.out.println("TOTAL DE EXAME "+ exame);

        mediaclasseconta = mediaclasse/i;

        System.out.printf("A MEDIA DA SALA É %.2f%n", mediaclasseconta);

    }
}
