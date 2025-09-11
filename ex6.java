import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("digite o codigo do item que deseja \n Digite tambem a quantidade.");
        System.out.println("100 Cachorro quente R$ 1,20");
        System.out.println("101 bauru simples   R$ 1,30");
        System.out.println("102 bauru com ovo   R$ 1,50");
        System.out.println("103 hamburguer      R$ 1,20");
        System.out.println("104 Cheeseburguer   R$ 1,30");
        System.out.println("105 refrigerante    R$ 1,00");

        int codigo = leitor.nextInt();
        int quantidade = leitor.nextInt();

        switch (codigo){
            case 100:
                System.out.println("voce escolheu o Cachorro quente e pediu " + quantidade + " unidades (por 1,20 cada)");
                double valorfinal0 = (quantidade*1.20);
                System.out.printf("Valor total a ser pago R$ %.2f %n", valorfinal0);
                break;
            case 101:
                System.out.println("voce escolheu o bauru simples e pediu " + quantidade + " unidades (por 1,30 cada)");
                double valorfinal1 = (quantidade*1.30);
                System.out.printf("Valor total a ser pago R$ %.2f %n", valorfinal1);
                break;
            case 102:
                System.out.println("voce escolheu o bauru com ovo e pediu " + quantidade + " unidades (por 1,50 cada)");
                double valorfinal2 = (quantidade*1.50);
                System.out.printf("Valor total a ser pago R$ %.2f %n", valorfinal2);
                break;
            case 103:
                System.out.println("voce escolheu o hamburguer e pediu " + quantidade + " unidades (por 1,20 cada)");
                double valorfinal3 = (quantidade*1.20);
                System.out.printf("Valor total a ser pago R$ %.2f %n", valorfinal3);
                break;
            case 104:
                System.out.println("voce escolheu o cheeseburguer e pediu " + quantidade + " unidades (por 1,30 cada)");
                double valorfinal4 = (quantidade*1.30);
                System.out.printf("Valor total a ser pago R$ %.2f %n", valorfinal4);
                break;
            case 105:
                System.out.println("voce escolheu o refrigerante e pediu " + quantidade + " unidades (por 1,00 cada)");
                double valorfinal5 = (quantidade*1.00);
                System.out.printf("Valor total a ser pago R$ %.2f %n", valorfinal5);
                break;
            default:
                System.out.println("CODIGO INVALIDO");

        }
    }
}
