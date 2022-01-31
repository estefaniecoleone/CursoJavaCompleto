//Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema cartesiano. Para cada ponto escrever o quadrante a que ele pertence. 
//O algoritmo será encerrado quando pelo menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).

import java.util.Scanner;

public class EX2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valorX, valorY;

        System.out.println("Digite X: ");
        valorX = sc.nextInt();
        System.out.println("Digite Y: ");
        valorY = sc.nextInt();

        while (valorX != 0 || valorY != 0) {
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
            System.out.println("Digite X: ");
            valorX = sc.nextInt();
            System.out.println("Digite Y: ");
            valorY = sc.nextInt();
        }
        sc.close();
    }
}
