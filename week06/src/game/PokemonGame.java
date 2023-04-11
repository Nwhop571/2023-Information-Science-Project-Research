package game;

public class PokemonGame {
    public static void main(String[] args) {
        Pokemon pikachu = new Pokemon("피카츄", 5, 100);
        Pokemon charizard = new Pokemon("리자몽", 36, 800);
        Pokemon squirtle = new Pokemon("꼬부기");
        Pokemon bulbasaour = new Pokemon();

        bulbasaour.setName("이상해씨");

//        pikachu.setName("피카츄");
//        charizard.setName("리자몽");
//        pikachu.setLevel(5);
//        charizard.setLevel(36);

        charizard.evolve();
        pikachu.evolve();
        pikachu.attack(charizard);
    }
}
