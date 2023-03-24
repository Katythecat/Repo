package rep1_20;

import java.util.Scanner;

public class R20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter First Name");
        String firstName=input.next();
        System.out.println("Please Enter Last Name");
        String lastName=input.next();

        System.out.println(firstName+" "+lastName);
    }
}
