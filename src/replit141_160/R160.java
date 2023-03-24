package replit141_160;

public class R160 {

    public void display(int number){
        System.out.println(number);
    }
    public void display(String str){
        System.out.println(str);
    }
    public void display(double number){
        System.out.println(number);
    }

    public static void main(String[] args) {
        R160 r=new R160();
        r.display(100);
        r.display("Syntax Technology");
        r.display(100.09);
    }
}

