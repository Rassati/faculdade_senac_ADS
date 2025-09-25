import java.sql.SQLOutput;
import java.util.Scanner;

public class ex9while {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int codigo;
        double precounidade = 0.0;
        int quantidade;
        double totalprodutos;
        double totalcompra = 0.0;
        int continuar;

        do{
            System.out.println("CARDAPIO");
            System.out.println("100: Cachorro quente - R$ 1,20");
            System.out.println("101: Bauru Simples - R$ 1,30");
            System.out.println("102: Bauru com ovo - R$ 1,50");
            System.out.println("103: Hambúrguer - R$ 1,20");
            System.out.println("104: Cheeseburguer - R$ 1,30");
            System.out.println("105: Refrigerante - R$ 1,00");
            System.out.println("DIGITE O CODIGO DO PRODUTO QUE DESEJA");
            codigo = leitor.nextInt();

            System.out.println("digite a quantidade que deseja");
            quantidade = leitor.nextInt();

            switch (codigo) {
                case 100:
                    precounidade = 1.20;
                    break;
                case 101:
                    precounidade = 1.30;
                    break;
                case 102:
                    precounidade = 1.50;
                    break;
                case 103:
                    precounidade = 1.20;
                    break;
                case 104:
                    precounidade = 1.30;
                    break;
                case 105:
                    precounidade = 1.00;
                    break;
                default:
                    System.out.println("INVALIDO");
                    precounidade = 0.0;
            }

            if (precounidade > 0) {
                totalprodutos = precounidade * quantidade;
                totalcompra += totalprodutos;


                System.out.printf("Valor desse item R$ %.2f%n", totalprodutos);
            }

            System.out.println("Deseja continuar comprando? 1 para sim e 0 para nao");
            continuar = leitor.nextInt();
        }while(continuar == 1);

        System.out.printf("VALOR TOTAL DA COMPRA R$ %.2f%n", totalcompra);

    }
}