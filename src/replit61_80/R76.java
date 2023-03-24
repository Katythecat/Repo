package replit61_80;

import java.util.Scanner;

public class R76 {
    public static void main(String[] args) {

        String[] days=new String[7];
        Scanner input=new Scanner(System.in);
        for(int i=0;i<days.length;i++){
            System.out.println("Please enter day "+(i+1)+" of the week(Start from Sunday)");
            days[i]=input.next();
        }
        for(String s:days){
            System.out.println(s);
        }


       /* String[] week = new String[7];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < week.length; i++) {//we start from 0 bc the index is fixed already
            System.out.println("Please enter day " +  (i+1) + " of the week (start from Sunday)");
            //we use i+1 bc we want to make it print day 1 this loop start from day 0 we don't have day 0
            week[i]= input.next();
        }
        input.close();

            for (int i = 0; i < week.length; i++) {
                System.out.println(week[i]);
            }*/
        }
    }
