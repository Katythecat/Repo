package replit61_80;

public class R80 {
    public static void main(String[] args) {
        double[][] number = {
                {1.4,2.0,3.3,2},
                {4,1.5,6.1,1},
                {1.2,3.1,4,1.6}
        };

        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < number[i].length; j++) {
                System.out.print(2*number[i][j]+" ");
            }
            System.out.println();
        }
        /*for(double[] d:number){
            for(double num:d){
                System.out.print(num*2+" ");
            }
            System.out.println();
        }*/
    }
}
