package game;

public class JetPack implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("제트팩을 이용해서 날아갑니다.");
    }
}
