package game;

public class PokemonGame {
    public static void main(String[] args) {
        Charizard charizard = new Charizard();
        Pikachu pikachu = new Pikachu(1, 35);
        Squirtle squirtle = new Squirtle();
        squirtle.setLevel(1);
        squirtle.setHp(100);
        System.out.println(squirtle.getHp());
        System.out.println(pikachu.getHp());
    }
}
