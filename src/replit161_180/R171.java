package replit161_180;

public class R171 extends Parent3 {

    public void m1(){
        System.out.println("m1 without parameters");
    }
    public void m1(int number){
        System.out.println("m1 method with parameter");
    }

    public static void main(String[] args) {
        R171 r=new R171();
        r.m1();
        r.m1(4);
    }
}

abstract class Parent3{
    abstract public void m1();
    abstract protected void m1(int number);
}
