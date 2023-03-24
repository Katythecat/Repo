package replit61_80;

import java.util.Scanner;

public class R77 {
    public static void main(String[] args) {
        int[] number=new int[5];
        Scanner input=new Scanner(System.in);
        for(int i=number.length-1;i>=0;i--){
           number[i]=input.nextInt();
        }
        for(int n:number){
            System.out.println(n);
        }
    }
}
