package game;

public class Pokemon {
    String name;
    int level;
    int hp;
    void evolve(){
        level = level + 1;
        hp = hp + 10;
        System.out.println(name + level + "레벨로 성장 합니다");
    }
    void attack(){
        System.out.println("기본 공격을 시전합니다");
    }
}
