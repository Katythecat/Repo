package replit141_160;

public class R152 {
    public static void main(String[] args) {
        Child5 child=new Child5("Vienna");
    }
}

class Parent5{
    String city;
    Parent5(String city){
        this.city=city;
        System.out.println(city);
    }
    Parent5(){
        System.out.println("Parent Constructor");
    }
}

class Child5 extends Parent5{
    Child5(String city){
        super(city);
    }
}