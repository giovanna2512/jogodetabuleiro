import java.util.Scanner;
import java.util.Random;

public class jgTabu {
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

    public static void main(String[] args) {
        int menu = exibirMenu();
        int jogadores = qntdJogadores();
        System.out.println(menu);
    }
}
