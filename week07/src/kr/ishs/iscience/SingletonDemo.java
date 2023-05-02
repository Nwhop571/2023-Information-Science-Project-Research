package kr.ishs.iscience;

class  Singleton{
    private static Singleton s = new Singleton();
    private Singleton(){
        System.out.println("One Object Created!");
    }

    public static Singleton getInstance() {
        return s;
    }
}
public class SingletonDemo {
    public static void main(String[] args) {
        System.out.println(Singleton.getInstance().toString());
    }
}
