package replit161_180;

public class R170 {

    final void method(boolean b){
        System.out.println("Final method with boolean parameter");
    }
    final void method(String str){
        System.out.println("Final method with String parameter");
    }

    public static void main(String[] args) {
        R170 r=new R170();
        r.method(true);
        r.method("I love cat");
    }
}
