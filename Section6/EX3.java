//Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. 
//Escreva um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel 4.Fim). 
//Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até que seja válido). 
//O programa será encerrado quando o código informado for o número 4. Deve ser escrito a mensagem: "MUITO OBRIGADO" e 
//a quantidade de clientes que abasteceram cada tipo de combustível, conforme exemplo.

import java.util.Scanner;

public class EX3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cod, alcool = 0, gasolina = 0, diesel = 0;

        System.out.println("Digite 1.Álcool 2.Gasolina 3.Diesel 4.Fim");
        cod = sc.nextInt();

        while (cod != 4) {
            System.out.println("Digite 1.Álcool 2.Gasolina 3.Diesel 4.Fim");
            cod = sc.nextInt();
            if (cod <= 0 || cod > 4) {
                System.out.println("Digite um codigo valido");
            }
            switch (cod) {
                case 1:
                    alcool += 1;
                    break;
                case 2:
                    gasolina += 1;
                    break;
                case 3:
                    diesel += 1;
                    break;
            }
        }
        System.out.println("MUITO OBRIGADA");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);
    }
}
