//Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar.
import java.util.Scanner;

public class EX5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cod, qtd, valor;
        double total;

        System.out.println("Digite o codigo do item: ");
        cod = sc.nextInt();
        System.out.println("Digite a quantidade do item: ");
        qtd = sc.nextInt();

        if (cod == 1) {
            total = qtd * 4;
            System.out.println("Total: R$ " + total);
        }
        if (cod == 2) {
            total = qtd * 4.5;
            System.out.println("Total: R$ " + total);
        }
        if (cod == 3) {
            total = qtd * 5;
            System.out.println("Total: R$ " + total);
        }
        if (cod == 4) {
            total = qtd * 2;
            System.out.println("Total: R$ " + total);
        }
        if (cod == 5) {
            total = qtd * 1.5;
            System.out.println("Total: R$ " + total);
        }
        sc.close();
    }
}
