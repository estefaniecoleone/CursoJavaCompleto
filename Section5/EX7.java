//Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).
//Se o ponto estiver na origem, escreva a mensagem “Origem”.
//Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a situação.import java.util.Scanner;

public class EX7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double valorX, valorY;

        System.out.println("Digite o valor de X");
        valorX = sc.nextDouble();
        System.out.println("Digite o valor de Y");
        valorY = sc.nextDouble();

        if (valorX > 0 && valorY > 0) {
            System.out.println("Q1");
        }
        if (valorX < 0 && valorY > 0) {
            System.out.println("Q2");
        }
        if (valorX < 0 && valorY < 0) {
            System.out.println("Q3");
        }
        if (valorX > 0 && valorY < 0) {
            System.out.println("Q4");
        }
        if (valorX == 0 && valorY > 0) {
            System.out.println("Origem - PONTO NO EIXO Y");
        }
        if (valorX > 0 && valorY == 0) {
            System.out.println("Origem - PONTO NO EIXO X");
        }
        if (valorX == 0 && valorY == 0) {
            System.out.println("Origem");
        }
        sc.close();
    }
}
