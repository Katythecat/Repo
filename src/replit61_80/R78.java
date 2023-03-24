package replit61_80;

import java.util.Scanner;

public class R78 {
    public static void main(String[] args) {
        int[] number=new int[5];
        Scanner input=new Scanner(System.in);
        for(int i=0;i<number.length;i++){
            number[i]=input.nextInt();
        }
        for(int num:number){
            System.out.println(num*10);
        }
    }
}
