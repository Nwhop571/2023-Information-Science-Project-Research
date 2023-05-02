package game;

public class PokemonGame {
    public static void main(String[] args) {
        System.out.println(Pokemon.getCount());
        Pokemon pikachu = new Pokemon("피카츄", 5, 100);
        Pokemon charizard = new Pokemon("리자몽", 36, 800);
        Pokemon squirtle = new Pokemon("꼬부기");
        System.out.println(Pokemon.getCount());
        Pokemon bulbasaour = new Pokemon();
        System.out.println(Pokemon.getCount());

        System.out.println(squirtle);
        System.out.println(pikachu);
        System.out.println(charizard);
        System.out.println(bulbasaour);

        bulbasaour.setName("이상해씨");
        bulbasaour.attack();

//        pikachu.setName("피카츄");
//        charizard.setName("리자몽");
//        pikachu.setLevel(5);
//        charizard.setLevel(36);

        charizard.evolve();
        pikachu.evolve();
        pikachu.attack(charizard);
    }
}
