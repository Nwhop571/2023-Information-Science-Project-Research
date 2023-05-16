package kr.ishs.iscience;

final class CannotInheritance{

}
// class SuperFinalDemo extends CannotInheritance (상속안됨)
class SuperFinalDemo{
    void test1(){
        System.out.println("test1 method!");
    }
    final void test2(){    //final은 상수취급(변경불가)
        System.out.println("test2 method!");
    }
}

public class FinalDemo extends SuperFinalDemo{
    public static final String POKEMON = "Pocket Monster"; //constant
    public static void main(String[] args) {
        System.out.println(Math.PI);
        System.out.println(Math.E);
        System.out.println(POKEMON);
        //POKEMON = "Good Pokemon"; //can not assign
    }

    @Override
    void test1() {
        System.out.println("override test1 method!");
    }

    //Parent class final methods cannot be overridden in child classes.
//    @Override
//    void test2() {
//        System.out.println("override test2 method!");
//    }
}

