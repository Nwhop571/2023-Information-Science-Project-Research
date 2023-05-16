package game;

public class PokemonGame {     //Pokemon.java안에 protected의 특성상 같은 패키지 안에서는 접근가능, extends가 없기 때문에 타 패키지에서 접근불가
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
