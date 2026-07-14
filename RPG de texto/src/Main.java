import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean rodar = true;

        while (rodar) {
            Personagem personagem = new Personagem();
            System.out.println("Bem vindo ao RPG de texto!");
            System.out.print("Digite o nome do seu personagem: ");
            personagem.nome = teclado.next();

            System.out.println("""
                    Escolha a opção que deseja:
                    [ 1 ] - 
                    """);


        }
    }
}
