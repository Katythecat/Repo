package replit141_160;

public class R158 {
    public static void main(String[] args) {
        Child child=new Child("Fairfax");
        child.display();
    }
}

class Parent{
    String city;

    public Parent(String city){
        this.city=city;
    }
    public void display(){
        System.out.println("City name "+city);
    }
}

class Child extends Parent{
    public Child(String city){
        super(city);
    }
}