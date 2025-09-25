import java.util.Scanner;

public class e2while {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        int contador = 0;
        int acumularnumerosp = 0;
        int acumularnumerosi = 0;
        while (contador < 10){
            contador ++;
            System.out.println("digite um numero (esse é o " +contador + " numero)");
            int n1 = leitor.nextInt();
            int resto = n1 %2;
        if (resto == 0 ){
                acumularnumerosp++;
            }
        else{
                acumularnumerosi++;
            }
        }
        System.out.println("quantidade de impares " + acumularnumerosi);
        System.out.println("quantidade de pares " + acumularnumerosp);
    }
}
