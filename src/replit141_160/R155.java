package replit141_160;

public class R155 {
    public static void main(String[] args) {
        CC c=new CC();
    }
}

class AA{
     public void print(){
         System.out.println("I");
     }
    }

class BB extends AA{
    BB(){
        super.print();
        System.out.println("am");
    }
}

class CC extends BB{
    CC(){
        System.out.println("a tester");
    }
}