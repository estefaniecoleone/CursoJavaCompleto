////Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o X, se for o caso.
package program;

import java.util.Scanner;

public class For_EX1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        System.out.println("Digite um valor");
        numero = sc.nextInt();

        for (int i = 1; i <= numero; i++) {
            if (i % 2 != 0)
                System.out.println(i);
        }
    }
}