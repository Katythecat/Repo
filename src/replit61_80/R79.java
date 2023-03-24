package replit61_80;

public class R79 {
    public static void main(String[] args) {
        double[][] number={{1.4,2.0,3.3,2.0},
                           {4.0,1.5,6.1,1.0},
                           {1.2,3.1,4.0,1.6}};
        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < number[i].length; j++) {
                System.out.print(number[i][j]+" ");
            }
            System.out.println();
        }

        /*for(double[] d:number){
            for(double num:d){
                System.out.print(num+" ");
            }
            System.out.println();
        }*/
    }
}
