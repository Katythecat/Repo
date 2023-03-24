package replit161_180;

public class R161 {
    private void m1(){
        System.out.println("private m1 method");
    }
    private void m1(int number){
        System.out.println("private m1 method with int parameter");
    }

    public static void main(String[] args) {
        R161 r=new R161();
        r.m1();
        r.m1(4);
    }
}
