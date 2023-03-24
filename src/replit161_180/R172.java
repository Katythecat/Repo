package replit161_180;

public class R172 extends Parent4 {
    public void m1(){
        System.out.println("Child class providing implementation");
    }

    public static void main(String[] args) {
        R172 r=new R172();
        r.m1();
        r.m2();
    }
}

abstract class Parent4{
    public void m2(){
        System.out.println("Parent class providing implementation");
    }
    abstract public void m1();
}