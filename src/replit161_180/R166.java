package replit161_180;

public class R166 {
    public static void main(String[] args) {
        Animal[] animals={new Cat("Cat"), new Kitten1("kitten1"), new Kitten2("kitten2"), new Kitten3("kitten3")};
        for(Animal a:animals){
            a.eat();
            a.sleep();
        }
    }

}

class Animal{
    String type;
    Animal(String type){
        this.type=type;
    }
    public void eat(){
        System.out.println(type+" eats");
    }
    public void sleep(){
        System.out.println(type+" sleeps");
    }
}

class Cat extends Animal{
    Cat(String type){
        super(type);
    }
    public void sleep(){
        System.out.println(type+" sleeps a lot");
    }
}

class Kitten1 extends Cat{
    Kitten1(String type){
        super(type);
    }
    public void eat(){
        System.out.println(type+" eats milk");
    }

}

class Kitten2 extends Cat{
    Kitten2(String type){
        super(type);
    }
    public void eat(){
        System.out.println(type+" eats snacks");
    }
}

class Kitten3 extends Cat{
    Kitten3(String type){
        super(type);
    }
    public void eat(){
        System.out.println(type+" eats everything");
    }
}