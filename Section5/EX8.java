import java.util.Scanner;

public class EX8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double valorSal, valorIr, valorDif;

        System.out.println("Digite o valor do salario: ");
        valorSal = sc.nextDouble();

        if (valorSal <= 2000) {
            System.out.println("ISENTO");
        }
        if (valorSal > 2000 && valorSal < 3000) {
            valorDif = valorSal - 2000;
            valorIr = valorDif * 0.08;
            System.out.println("R$ " + valorIr);
        }
        if (valorSal > 3000 && valorSal <= 4500) {
            valorDif = valorSal - 3000;
            valorIr = 1000 * 0.08 + valorDif * 0.18;
            System.out.println("R$ " + valorIr);
        }
        if (valorSal > 4500) {
            valorDif = valorSal - 4500;
            valorIr = 1000 * 0.08 + 1500 * 0.18 + valorDif * 0.28;
            System.out.println("R$ " + valorIr);
        }

        sc.close();
    }
}
