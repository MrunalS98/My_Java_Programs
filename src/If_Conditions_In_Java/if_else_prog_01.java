package If_Conditions_In_Java;

import java.util.Scanner;

public class if_else_prog_01 {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();

        if (age>=18){
            System.out.println("You are allowed to vote");
        }
        else {
            System.out.println("You are not allowed to vote");
        }
    }
}
