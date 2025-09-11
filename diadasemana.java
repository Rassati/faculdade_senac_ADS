import java.util.Scanner;

public class diadasemana {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um numero para o dia da semana. \ntenha em mente que 1 = domingo");

        int dia = leitor.nextInt();

        switch(dia){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("segunda");
                break;
            case 3:
                System.out.println("terça");
                break;
            case 4:
                System.out.println("quarta");
                break;
            case 5:
                System.out.println("quinta");
                break;
            case 6:
                System.out.println("sexta");
                break;
            case 7:
                System.out.println("sabado");
                break;
            default:
                System.out.println("invalido");
        }
    }
}
