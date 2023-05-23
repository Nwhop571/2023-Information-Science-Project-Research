package game;

public class PokemonGame {     //Pokemon.java안에 protected의 특성상 같은 패키지 안에서는 접근가능, extends가 없기 때문에 타 패키지에서 접근불가
    public static void main(String[] args) {
        Pikachu pikachu1 = new Pikachu(14, 165);
        pikachu1.electricInfo();
        //Pikachu pikachu3 = new Squirtle();
        Charizard charizard = new Charizard(36, 80);

        System.out.println(pikachu1);

        Pokemon pokemon = new Pikachu(1, 35);
        //pokemon.electricInfo();  // can not use

        System.out.println(pokemon);

        Pikachu pikachu2 = (Pikachu) pokemon;  // downcast
        //Squirtle squirtle1 = (Squirtle) pokemon;
        pikachu2.electricInfo();  // accessible

        System.out.println(pikachu2);  // same address (pokemon)

        System.out.println(pokemon.getHp());
        System.out.println(pikachu2.getHp());

        Squirtle squirtle1 = new Squirtle();

        pikachu1.attack();
        pokemon.attack();
        squirtle1.attack();

        pikachu1.attack(squirtle1);

        Trainer trainer1 = new Trainer();
        //pikachu1.attack(trainer1);  // incompatible

        charizard.attack(pikachu1);

        //Pokemon pokemon2 = new Pokemon();  // 할 수 없다.
    }
}
