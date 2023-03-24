package replit161_180;

public class R163 {
    public static void main(String[] args) {
        Parent.method();
        Child.method();
    }

}

class Parent{
    public static void method(){
        System.out.println("Parent method");
    }
}

class Child{
    public static void method(){
        System.out.println("Child method");
    }
}