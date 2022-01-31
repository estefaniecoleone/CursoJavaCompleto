//Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
import java.util.Scanner;

public class EX2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.println("Digite um numero!");
        numero = sc.nextInt();

        if (numero % 2 == 0) {
            System.out.println("NUMERO PAR!!!");
        } else {
            System.out.println("NUMERO IMPAR!!!");
        }
        sc.close();
    }
}
