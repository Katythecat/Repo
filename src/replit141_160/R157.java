package replit141_160;

public class R157 {
    public static void main(String[] args) {
        Child1 child1 = new Child1();
        child1.m2();
    }
}

class Parent1{
    public void m1(){
        System.out.println("m1 method in parent class");
    }
}

class Child1 extends Parent1{
    public void m1(){
        System.out.println("m1 method in child class");
    }
    public void m2(){
        this.m1();
        super.m1();//super keyword if use with constructor should to declare at the first line

    }
}
