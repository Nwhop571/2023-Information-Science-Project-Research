package game;

public class Squirtle extends Pokemon{
    public Squirtle(){
        this.setHp(44);
        this.setLevel(1);
        this.setName("squirtle");
    }
    public Squirtle(int level, int hp){
        super();
        this.setHp(hp);
        this.setLevel(level);
        this.setName("squirtle");
    }
}
