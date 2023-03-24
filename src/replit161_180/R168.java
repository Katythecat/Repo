package replit161_180;

public class R168 {
    final StringBuilder reverse(String str){
        return new StringBuilder(str).reverse();
    }

    public static void main(String[] args) {
        R168 r=new R168();
        System.out.println(r.reverse("Hakuna matata"));
    }
}
