package Personagens;

public class Personagem {
    public String nome;
    public String classe;
    public double ataque;
    public double defesa;
    public double vida;
    public int nivel = 1;
    public double xpAtual = 0.0;
    public double xpNecessario = 100;

    public void aumentarNivel() {
        if (xpAtual >= xpNecessario) {
            System.out.println("Você upou de nível!");
            xpAtual -= xpNecessario;
            xpNecessario *= 2;
            nivel++;
            ataque *= 1.25;
            defesa *= 1.25;
            vida *= 1.25;
            if (xpAtual < 0) {
                xpAtual = 0;
            }
        }
    }
}


