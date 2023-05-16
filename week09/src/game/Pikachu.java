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

    @Override
    void attack() {
        super.attack();
        //System.out.println(this.getName() + " does a wide area attack"); //이 부분은 부모 특성에서 추가되어 실행됨
    }
}
