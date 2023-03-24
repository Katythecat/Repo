package replit161_180;

public class R173 {
    public static void main(String[] args) {
        Tea[] teas={new LemonTea("Lemon Tea"),new ChaiTea("Chai Tea")};
        for(Tea t:teas){
            t.addSugar();
        }
    }
}

abstract class Tea{
    String teaType;
    Tea(String teaType){
        this.teaType=teaType;
    }
    abstract public void addSugar();
}

class LemonTea extends Tea{
    LemonTea(String teaType){
        super(teaType);
    }
    public void addSugar(){
        System.out.println("For "+teaType+" we need 2 spoons of sugar");
    }
}

class ChaiTea extends Tea{
    ChaiTea(String teaType){
        super(teaType);
    }
    public void addSugar(){
        System.out.println("For "+teaType+" we need 1 spoons of sugar");
    }
}