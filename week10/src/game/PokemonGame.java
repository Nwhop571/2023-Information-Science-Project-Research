package game;

public class PokemonGame {     //Pokemon.java안에 protected의 특성상 같은 패키지 안에서는 접근가능, extends가 없기 때문에 타 패키지에서 접근불가
    public static void main(String[] args) {
        Pikachu pikachu = new Pikachu(14, 165);
        Charizard charizard = new Charizard(36, 80);

        Wings wings = new Wings();
        JetPack jetPack = new JetPack();

        pikachu.setFlyable(jetPack);
        charizard.setFlyable(wings);
        charizard.performFly();
        pikachu.performFly();
    }
}
