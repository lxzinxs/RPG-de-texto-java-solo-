import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();
        Personagem jogador = new Personagem();
        Monstros monstros = new Monstros();

        boolean rodarMenu = true;
        boolean validarPersonagem = false;
        boolean validarAcao = false;

        String nomePersonagem = "";

        while (rodarMenu) {
            System.out.println("""
                    Bem vindo ao RPG de texto!
                    
                    Escolha a opção que deseja:
                    [ 1 ] - Cadastrar
                    [ 2 ] - Entrar
                    [ 3 ] - Sair
                    """);
            int opcaoEntrada = teclado.nextInt();

            if (opcaoEntrada == 1) {
                System.out.println("Digite o nome do seu personagem: ");
                nomePersonagem = teclado.next();
                validarPersonagem = true;
                rodarMenu = false;
            } else if (opcaoEntrada == 2) {
                System.out.println("Opção atualmente indisponivel");
            } else if (opcaoEntrada == 3) {
                System.out.println("Você saiu!");
                rodarMenu = false;
            } else {
                System.out.println("Escolha uma opção válida!");
            }
        }

        while (validarPersonagem) {
            System.out.println("""
                    Escolha a classe que deseja:
                    
                    [ 1 ] - Arqueiro
                    [ 2 ] - Guerreiro
                    [ 3 ] - Mago
                    """);

            int opcaoClasse = teclado.nextInt();
            if (opcaoClasse == 1) {
                System.out.println("Você escolheu a classe Arqueiro!");
                jogador = new Personagem.Arqueiro();
                jogador.classe = "Arqueiro";
                jogador.nome = nomePersonagem;
                validarAcao = true;
            } else if (opcaoClasse == 2) {
                System.out.println("Você escolheu a classe Guerreiro!");
                jogador = new Personagem.Guerreiro();
                jogador.classe = "Guerreiro";
                jogador.nome = nomePersonagem;
                validarAcao = true;
            } else if (opcaoClasse == 3) {
                System.out.println("Você escolheu a classe Mago!");
                jogador = new Personagem.Mago();
                jogador.classe = "Mago";
                jogador.nome = nomePersonagem;
                validarAcao = true;
            } else {
                System.out.println();
                validarPersonagem = false;
            }

            while (validarAcao) {
                System.out.println("""
                        Escolha a proxima opção:
                        [ 1 ] - Treinar
                        [ 2 ] - Aventurar
                        [ 3 ] - Ir para a dungeon
                        [ 4 ] - Mostrar status
                        """);

                int opcaoAcao = teclado.nextInt();
                if (opcaoAcao == 1) {
                    System.out.println("Você treinou!");
                    jogador.xpAtual += 5;
                    jogador.aumentarNivel();
                } else if (opcaoAcao == 2) {
                    System.out.println("Você se aventurou!");
                } else if (opcaoAcao == 3) {
                    System.out.println("""
                            Escolha a dungeon que deseja entrar:
                            [ 1 ] - Rato
                            [ 2 ] - Goblin
                            [ 3 ] - Orc
                            """);
                    int opcaoDungeon = teclado.nextInt();

                    if (opcaoDungeon == 1) {
                        System.out.println("Você entrou na dungeon dos ratos!");
                        monstros = new Monstros.Rato();
                        int quantidadeRatos = aleatorio.nextInt(5) + 1;
                        System.out.printf("\nVocê encontrou %d ratos!", quantidadeRatos);
                    } else if (opcaoDungeon == 2) {

                    } else if (opcaoDungeon == 3) {

                    } else {

                    }
                } else if (opcaoAcao == 4) {
                    System.out.printf("""
                            Nome: %s
                            Nível: %d
                            Classe: %s
                            """, jogador.nome, jogador.nivel, jogador.classe);
                } else {
                    System.out.println("Escreva uma opção válida!");
                    validarAcao = false;
                }
            }
        }
    }
}