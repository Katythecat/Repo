package replit61_80;

public class R81 {
    public static void main(String[] args) {
        int[] num={5,4,8};
        int max=num[0];
        for(int x:num){
            if(x>max){
                max=x;
            }
        }
        System.out.println(max);

       /* for (int i = 0; i < num.length; i++) {
            if(num[i]>max){
                max=num[i];
            }
        }
        System.out.println(max);*/
    }
}


