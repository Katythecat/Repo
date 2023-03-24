package replit141_160;

public class R151 {

    static int sum2D(int[][] arr){
        int sum=0;
        for(int[] a:arr){
            for(int b:a){
                sum+=b;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] a = {

                { 1, 2, 3 },

                { 4, 5, 6 },

                { 7, 8, 9 }

        };
        System.out.println(sum2D(a));
    }
}

