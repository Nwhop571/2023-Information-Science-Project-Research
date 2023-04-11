package game;

public class PokemonGame {
    public static void main(String[] args) {
        Pokemon pikachu = new Pokemon();
        Pokemon charizard = new Pokemon();

        pikachu.name = "피카츄";
        charizard.name = "리자몽";

        pikachu.level = 5;
        charizard.level = 36;

        charizard.evolve();
        charizard.attack();
        pikachu.evolve();
        pikachu.attack();
    }
}
