import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("qual periodo voce estuda?");
        System.out.println("M para matutino");
        System.out.println("V para vespertino");
        System.out.println("N para noturno");

        String periodo = leitor.next().toUpperCase();

        switch (periodo){
            case ("M"):
                System.out.println("BOM DIA");
                break;
            case ("V"):
                System.out.println("BOA TARDE");
                break;
            case ("N"):
                System.out.println("BOA NOITE");
                break;
            default:
                System.out.println("invalido");
        }
    }
}
