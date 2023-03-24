package replit161_180;

public class R162 {
    static void display(){
        System.out.println("static method without parameter");
    }
    static void display(int number){
        System.out.println("static method with int parameter");
    }

    public static void main(String[] args) {
        R162 r=new R162();
        display();
        display(34);

    }

}
