package game;

public class PokemonGame {     //Pokemon.java안에 protected의 특성상 같은 패키지 안에서는 접근가능, extends가 없기 때문에 타 패키지에서 접근불가
    public static void main(String[] args) {
        Pikachu pikachu1 = new Pikachu(14, 165);
        pikachu1.electricInfo();

        System.out.println(pikachu1);

        Pokemon pokemon = new Pikachu(1, 35);
        //pokemon.electricInfo();  // can not use

        System.out.println(pokemon);

        Pikachu pikachu2 = (Pikachu) pokemon;
        pikachu2.electricInfo();

        System.out.println(pikachu2);
    }
}