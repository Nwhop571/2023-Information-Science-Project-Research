package game;

public class PokemonGame {
    public static void main(String[] args) {
        Pokemon pikachu = new Pokemon();
        Pokemon charizard = new Pokemon();

        pikachu.setName("피카츄");
        charizard.setName("리자몽");
        pikachu.setLevel(5);
        charizard.setLevel(36);

        charizard.evolve();
        pikachu.evolve();
        pikachu.attack(charizard);
    }
}
