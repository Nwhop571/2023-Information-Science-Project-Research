package kr.ishs.iscience;

class  Singleton{
    private static Singleton s = new Singleton();
    private Singleton(){
        System.out.println("One Object Created!");
    }

    public static Singleton getInstance() {
        return s;
    }

    @Override
    public String toString() {
        return "Singleton Pattern Object";
    }
}
public class SingletonDemo {
    public static void main(String[] args) {
        System.out.println(Singleton.getInstance().toString());

        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        if(s1==s2){
            System.out.println("Same Object!");
        }
        else{
            System.out.println("Different Object!");
        }
    }
}
