//Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
//segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".
package program;

import java.util.Locale;
import java.util.Scanner;

public class For_EX4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            if (num2 == 0) {
                System.out.println("Divisao impossivel");
            } else {
                double div = num1 / num2;
                System.out.println(div);
            }
        }
    }
}
