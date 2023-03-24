package replit161_180;

public class R169 {
    final double avgElement(int[] number){
        double sum=0;
        double avg=0;
        for(int a:number){
            sum+=a;
            avg=sum/ number.length;
        }
        return avg;
    }

    public static void main(String[] args) {
        int[] a = {2,7,3,8,4};
        R169 r=new R169();
        System.out.println(r.avgElement(a));

    }
}
