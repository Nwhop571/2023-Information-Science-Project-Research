package game;

public abstract class Pokemon {  // 이 클래스의 객체를 만들지 못한다.
    protected int level;
    protected int hp;
    protected String name;



    FlyBehavior flyable;  // assaciation

    public void setFlyable(FlyBehavior flyable) {
        this.flyable = flyable;
    }

    public void performFly(){
        System.out.print(this.name + " ");
        this.flyable.fly();
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void attack();

    public void attack(Pokemon targetPokemon){
        if (this instanceof Pikachu){
            System.out.println("pika pika~!");
        }
        System.out.println(this.name + " does a attack to " + targetPokemon.name);
    }
}
