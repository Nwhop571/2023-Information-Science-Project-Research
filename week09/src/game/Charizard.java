package game;

public class Charizard extends Pokemon{

    public Charizard() {
        this.setHp(78);
        this.setLevel(36);
        this.setName("charizard");
    }
    public Charizard(int level, int hp){
        super();
        this.setHp(hp);
        this.setLevel(level);
        this.setName("charizard");
    }
}
