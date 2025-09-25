import java.util.Scanner;

public class e6while {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int rep = 1;
        int n1 = 0, n2 = 0, n3 = 0, n4 = 0, n5 = 0, n6 = 0, n7 = 0, n8 = 0, n9 = 0, n10 = 0;
        while (rep <= 10) {
            System.out.printf("digite %d numero inteiro e positivo", rep);
            int n0 = leitor.nextInt();

            switch (rep) {

                case 1:
                    n1 = n0;
                    break;

                case 2:
                    n2 = n0;
                    break;

                case 3:
                    n3 = n0;
                    break;

                case 4:
                    n4 = n0;
                    break;

                case 5:
                    n5 = n0;
                    break;

                case 6:
                    n6 = n0;
                    break;

                case 7:
                    n7 = n0;
                    break;

                case 8:
                    n8 = n0;
                    break;

                case 9:
                    n9 = n0;
                    break;

                case 10:
                    n10 = n0;
                    break;



                default:

                    System.out.println("stop");
            }
            rep++;
        }

        int menor = n1;
        if (n2 < menor) menor = n2;
        if (n3 < menor) menor = n3;
        if (n4 < menor) menor = n4;
        if (n5 < menor) menor = n5;
        if (n6 < menor) menor = n6;
        if (n7 < menor) menor = n7;
        if (n8 < menor) menor = n8;
        if (n9 < menor) menor = n9;
        if (n10 < menor) menor = n10;

        System.out.println("Menor número digitado: " + menor);

    }
}
