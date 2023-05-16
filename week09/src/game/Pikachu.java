package game;

public class Pikachu extends Pokemon{
    public Pikachu(){
        this.hp = 35;     // protected access (without setter)
        this.level = 1;
        this.name = "pikachu";
    }
    public Pikachu(int level, int hp){
        super();
        this.hp = hp;
        this.level = level;
        this.name = "pikachu";
    }

    @Override
    public void attack() {
        super.attack();
        //System.out.println(this.name + " does a wide area attack"); //이 부분은 부모 특성에서 추가되어 실행됨
    }
}
