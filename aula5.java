import java.util.Scanner;

public class aula5 {
    public static void main(String[] args) {
        System.out.println("menu");
        System.out.println("1 para cadastrar produtos");
        System.out.println("2 para listar de produtos");
        System.out.println("3 sair do sistema");

        Scanner leitor = new Scanner(System.in);
        int menu = leitor.nextInt();

        switch(menu){
            case 1:
                System.out.println("voce escolheu o menu 1");
                System.out.println("cadastrar produtos");
                break;
            case 2:
                System.out.println("voce escolheu o menu 2");
                System.out.println("opcao listar produtos");
                break;
            case 3:
                System.out.println("escolheu o menu 3");
                System.out.println("sair do sistema");
                break;
            default:
                System.out.println("item invalido");
        }
    }
}
