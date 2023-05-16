package game;

public class Pokemon {
    protected int level;
    protected int hp;
    protected String name;


    void attack(){
        System.out.println(this.name + " does a wide area attack");
    }
}
