package game;

public class PokemonGame {
    public static void main(String[] args) {
        Charizard charizard = new Charizard();
        Pikachu pikachu = new Pikachu(14, 165);
        Squirtle squirtle = new Squirtle();
        squirtle.level = 1;
        squirtle.hp = 100;

        System.out.println(charizard.name);
        charizard.name = "리자몽";
        System.out.println(charizard.name);

        System.out.println(squirtle.hp);
        System.out.println(pikachu.hp);
        System.out.println(pikachu.name);

        pikachu.attack(); //execute override method
        squirtle.attack(); //execute override method
        charizard.attack(); //execute override method
    }
}
