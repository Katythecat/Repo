package replit141_160;

public class R153 {
    public static void main(String[] args) {
        Child4 child=new Child4();
    }
}

class Parent4{
    Parent4(){
        System.out.println("This is Parent constructor");
    }
}

class Child4 extends Parent4{
    Child4(){
        super();
    }
}