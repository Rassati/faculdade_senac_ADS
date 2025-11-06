import java.util.Scanner;

public class diasemana {

    public static String semanadia(int n1) {
        switch (n1){
            case 1:
                return "Domingo";
            case 2:
                return "Segunda";
            case 3:
                return "Terça";
            case 4:
                return "Quarta";
            case 5:
                return "Quinta";
            case 6:
                return "Sexta";
            case 7:
                return "Sabado";

            default:

                return "numero invalido";
        }

    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("digite um numero de 1 a 7");
        int numero = leitor.nextInt();
        System.out.println("o dia da semana referente ao numero é " + semanadia(numero));

    }
}
