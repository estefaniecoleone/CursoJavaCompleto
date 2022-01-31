//Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
import java.util.Scanner;

public class EX4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int horaInicial, horaFinal, duracao;

        System.out.println("Digite a hora de inicio do jogo:");
        horaInicial = sc.nextInt();

        System.out.println("Digite a hora de fim do jogo:");
        horaFinal = sc.nextInt();

        duracao = horaFinal - horaInicial;

        System.out.print("O jogo durou " + duracao + "  horas");
        sc.close();
    }
}
