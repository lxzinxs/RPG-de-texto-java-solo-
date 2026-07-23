public class Monstros extends Personagem {
    String nome;
    int dano;
    int vida;
    int defesa;

    public static class Rato extends Monstros{
        public Rato(){
            nome = "rato";
            dano = 5;
            vida = 50;
            defesa = 3;
        }
    }
}
