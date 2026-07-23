public class Personagem {
    String nome;
    String classe;
    double ataque;
    double defesa;
    double vida;
    int nivel = 1;
    double xpAtual = 0.0;
    double xpNecessario = 100;

    //Classe arqueiro
    public static class Arqueiro extends Personagem {
        public Arqueiro() {
            vida = 80;
            ataque = 8;
            defesa = 4;
        }
    }

    //Classe guerreiro
    public static class Guerreiro extends Personagem {
        public Guerreiro() {
            vida = 100;
            ataque = 6;
            defesa = 6;
        }
    }

    //Classe mago
    public static class Mago extends Personagem {
        public Mago() {
            vida = 60;
            ataque = 10;
            defesa = 2;
        }
    }

    public void aumentarNivel() {
        if(xpAtual >= xpNecessario){
            System.out.println("Você upou de nível!");
            xpAtual -= xpNecessario;
            xpNecessario *= 2;
            nivel++;
            ataque *= 1.25;
            defesa *= 1.25;
            vida *= 1.25;
        }
    }
}


