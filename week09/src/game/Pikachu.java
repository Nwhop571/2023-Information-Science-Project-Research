package game;

public class Pikachu extends Pokemon{
    public Pikachu(){
        this.setHp(35);
        this.setLevel(1);
        this.setName("pikachu");
    }
    public Pikachu(int level, int hp){
        super();
        this.setHp(hp);
        this.setLevel(level);
        this.setName("pikachu");
    }
}
