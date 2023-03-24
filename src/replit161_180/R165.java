package replit161_180;

public class R165 {
    public static void main(String[] args) {

        Child2 child=new Child2();
        child.print();
        child.print1();
        child.print2();
    }
}

class Parent2{
    public void print(){
        System.out.println("I am parent public method");
    }
    protected void print1(){
        System.out.println("I am parent protected method");
    }
    void print2(){
        System.out.println("I am parent default method");
    }
    private void print3(){
        System.out.println("I am parent private method");
    }
}

class Child2 extends Parent2{
    public void print(){
        System.out.println("I am child public method");
    }
    protected void print1(){
        System.out.println("I am child protected method");
    }
    void print2(){
        System.out.println("I am child default method");
    }
    private void print3(){//private access cannot be overloaded
        System.out.println("I am child private method");
    }
}