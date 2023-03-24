package replit141_160;

public class R156 {
    public static void main(String[] args) {
        B boy=new B();
        boy.display();
    }
}

class A{
    int i=10;
}

class B extends A{
    int i=20;
    public void display(){
        System.out.println(this.i);
        System.out.println(super.i);
    }
}