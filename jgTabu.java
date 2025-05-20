import java.util.Scanner;
import java.util.Random;

//ideias:
//- tabuleiro de terror
//- corrida
//- circuito aberto
//- charadas em cada casa (penalidade personalizada por charada)
//- "NPC" que de *2 em 2 rodadas diminui o numero de casas
//- mensagem de morte personalizada

public class Main {
    public static int exibirMenu() {
        Scanner input = new Scanner(System.in);
        int escolha;

        System.out.print("*** SUSSUROS DO ALÉM ***");
        System.out.print("\n-----------------------");
        System.out.print("\n|(1) Novo Jogo         |");
        System.out.print("\n|(2) Instruções        |");
        System.out.println("\n|(3) Sair              |");
        System.out.println("-----------------------");
        System.out.print("➢ ");
        escolha = input.nextInt();

        return escolha;
    }
    public static int qntdJogadores() {
        Scanner input = new Scanner(System.in);

        System.out.println("\n*** QUANTIDADE JOGADORES ***");
        System.out.print("------------------------------");
        System.out.print("\n| 2. AMALDIÇOADOS           |");
        System.out.print("\n| 3. DESOLADOS              |");
        System.out.print("\n| 4. PECADORES              |");
        System.out.println("\n------------------------------");
        System.out.print("➢ ");
        int escolha2 = input.nextInt();

        return escolha2;
    }
    public static void exibirInstrucoes() {
        System.out.println("As almas aqui presentes devem fugir do umbral antes que sejam encontradas pelo carrasco.");
        System.out.println("COMO JOGAR: \n" + "1. Cada turno, o jogador ativo lança o dado de 3 lados e avança seu peão o número de casas correspondente.\n" +
                "2. Após o movimento do jogador, o Carrasco avança 1 casa a cada turno do conjunto de jogadores (exemplo: se houver 4 jogadores, a cada 4 turnos o carrasco avança 1 casa).\n");
    }

    public static void main(String[] args) {
        int menu = exibirMenu();
        int jogadores = qntdJogadores();
        System.out.println(menu);
    }
}
