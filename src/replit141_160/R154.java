package replit141_160;

public class R154 {
    public static void main(String[] args) {
        Child3 child=new Child3();
        Child3 children=new Child3(10);
    }
}

class Parent3{
    int number;
    Parent3(){
        System.out.println("Parent Constructor without argument");
        }
    Parent3(int number){
        this.number=number;
        System.out.println(number);
    }
}

class Child3 extends Parent3{
    Child3(){
        System.out.println("Child Constructor without argument");
    }
    Child3(int number){
        super(number);
    }
}

