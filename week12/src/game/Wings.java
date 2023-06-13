package game;

public class Wings implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("날개를 펴서 날아갑니다.");
    }
}
