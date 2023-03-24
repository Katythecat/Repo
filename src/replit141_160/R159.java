package replit141_160;

public class R159 {
    public String sub(int a, int b){
        return a-b+" (should come from subtracting 2 numbers) ";
    }
    public String sub(int a, int b, int c){
        return a-b-c+" (should come from subtracting 3 numbers) ";
    }
    public String sub(int a, int b, int c, int d){
        return a-b-c-d+" (should come from subtracting 4 numbers) ";
    }

    public static void main(String[] args) {
        R159 substraction=new R159();
        System.out.println(substraction.sub(60,1,9,10));
        R159 substraction1=new R159();
        System.out.println(substraction1.sub(40,8,2));
        R159 substraction2=new R159();
        System.out.println(substraction2.sub(35,15));


    }

}
