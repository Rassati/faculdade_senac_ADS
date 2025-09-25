import java.util.Scanner;

public class ex4for {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int i;
        int idade;
        double altura;
        int contagem = 0;
        double alturasoma = 0;
        double mediaalturaidoso;
        
        for(i = 1; i <= 10; i++){

            System.out.println("digite sua idade");
            idade = leitor.nextInt();
            System.out.println("digite sua altura");
            altura = leitor.nextDouble();

            if (idade >= 50) {
                contagem++;
                alturasoma += altura;
            }

        }
        mediaalturaidoso = (alturasoma/contagem);

        System.out.println("MEDIA DE ALTURA DOS IDOSOS ACIMA DE 50 ANOS É "+ mediaalturaidoso);

    }
}