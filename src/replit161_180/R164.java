package replit161_180;

public class R164 {
    public static void main(String[] args) {
        Parent1[] parent1={new Child1(), new Childd1(),new Childdd1()};
        for(Parent1 a:parent1){
            a.hello();
        }
    }
}

class Parent1{
    public void hello(){
        System.out.println("method in parent class");
    }
}

class Child1 extends Parent1{
    public void hello(){
        System.out.println("method in Child1 class");
    }
}

class Childd1 extends Parent1{
    public void hello(){
        System.out.println("method in Child2 class");
    }
}

class Childdd1 extends Parent1{
    public void hello(){
        System.out.println("method in Child3 class");
    }
}