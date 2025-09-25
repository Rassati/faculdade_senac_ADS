import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double altura, peso, altura1020 = 0, altura1020conta;
        int i, idosos = 0, idade1020 = 0, peso40 = 0, idade;

        for (i = 1;i<=10;i++){

            System.out.println("digite sua idade");
            idade = leitor.nextInt();
            System.out.println("digite sua altura");
            altura = leitor.nextDouble();
            System.out.println("digite seu peso");
            peso = leitor.nextDouble();



            if (idade > 50){
                idosos++;
            }
            if (idade >= 10 && idade <= 20){
                idade1020++;
                altura1020 += altura;
            }
            if (peso < 40){
                peso40++;

            }



        }

        System.out.println("QUANTIDADE DE PESSOAS MAIS 50 É" + idosos);

        System.out.println("PESO MENOR QUE 40 É " + peso40 + "0%");

        altura1020conta = altura1020/idade1020;

        System.out.printf("A MEDIA DA ALTURA DE PESSOAS ENTRE 10 E 20 ANOS É %.2f%n", altura1020conta);

    }
}

