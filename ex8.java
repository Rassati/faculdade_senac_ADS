import java.util.Scanner;

public class ex8 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        System.out.println("digite sua senha");
        String senha = leitor.nextLine();

        if(senha.equals("R10p5")){
            System.out.println("acesso permitido");
        } else {

            System.out.println("acesso negado");

        }

    }
}
