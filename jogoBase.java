import java.util.Random;
import java.util.Scanner;

public class jogoBase {

    // Define o tabuleiro (cada casa contém uma charada de terror)
    static String[] tabuleiro = {
        "Charada 1: O que faz o vento assobiar à noite?",
        "Charada 2: Qual é o som do crepitar das folhas secas em um cemitério?",
        "Charada 3: Quem caminha lentamente pela casa, com passos pesados e um olhar vazio?",
        "Charada 4: O que acontece quando você acende uma vela em uma noite escura?",
        "Charada 5: Eu vejo sem olhos, falo sem língua, e nunca posso ser tocado. Quem sou eu?",
        "Charada 6: O que mora nas profundezas e uiva nas noites sem lua?",
        "Charada 7: Quem assombra os corredores e não tem sombra?",
        "Charada 8: O que você nunca deve olhar diretamente, mas sempre sente presença?",
        "Charada 9: Qual criatura se esconde nas sombras, esperando o momento certo?",
        "Charada 10: O que você ouve na escuridão, mas não pode ver?",
        "Fim do Jogo: Você chegou ao fim da jornada, mas o que encontrou lá...?"
    };
    //Menu
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

    // Função para sortear um dado (1 a 6)
    public static int sortearDado() {
        Random rand = new Random();
        return rand.nextInt(6) + 1;
    }

    // Função para verificar a resposta à charada
    public static boolean verificarResposta(String resposta) {
        switch (resposta.toLowerCase()) {
            case "o lamento de almas perdidas":
            case "o som de ossos quebrando":
            case "o morto-vivo":
            case "os fantasmas se aproximam":
            case "o eco de um grito":
                return true;
            default:
                return false;
        }
    }

    // Função para pedir o nome do jogador
    public static String nomeJogador(int numeroJogador) {
        String jogador;
        Scanner sc = new Scanner(System.in);
        
        // Solicita o nome do jogador
        System.out.println("Digite o nome do Jogador " + numeroJogador + ": ");
        // Lê o nome do jogador e retorna
        jogador = sc.nextLine();
        return jogador;
    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int menu = exibirMenu();  
        System.out.println(menu);
        // Pede os nomes dos jogadores
        String nomeJogador1 = nomeJogador(1);
        String nomeJogador2 = nomeJogador(2);
        
        // Inicializa as posições dos jogadores
        int jogador1 = 0, jogador2 = 0;
        int turno = 1; // Jogador 1 começa

        System.out.println("Bem-vindo ao Jogo de Corrida de Terror!");

        // Loop do jogo
        while (jogador1 < tabuleiro.length - 1 && jogador2 < tabuleiro.length - 1) {
            System.out.println("\nTurno do Jogador " + + turno + ":");

            // Sorteio do dado
            int dado = sortearDado();
            System.out.println("Você sorteou um " + dado + " no dado.");

            // Jogador 1 ou 2 avança
            int jogadorAtual = (turno == 1) ? jogador1 : jogador2;
            int posicaoFutura = jogadorAtual + dado;

            // Se o jogador não passar do final, ele avança
            if (posicaoFutura < tabuleiro.length) {
                System.out.println("Você caiu na casa " + (posicaoFutura + 1) + ": " + tabuleiro[posicaoFutura]);
                System.out.print("Resposta à charada: ");
                String resposta = sc.nextLine();

                // Verificar resposta
                if (verificarResposta(resposta)) {
                    System.out.println("Resposta correta! Avance 2 casas.");
                    jogadorAtual += 2;
                } else {
                    System.out.println("Resposta errada! Volte 2 casas.");
                    jogadorAtual -= 2;
                }

                // Atualiza a posição do jogador
                if (turno == 1) {
                    jogador1 = jogadorAtual;
                } else {
                    jogador2 = jogadorAtual;
                }
            }

            // Verifica quem é o próximo jogador
            turno = (turno == 1) ? 2 : 1;
        }

        // Determina o vencedor
        if (jogador1 >= tabuleiro.length - 1) {
            System.out.println("\n" + nomeJogador1 + " venceu!");
        } else {
            System.out.println("\n" + nomeJogador2 + " venceu!");
        }

        sc.close();
    }
}