package If_Conditions_In_Java;

import java.util.Scanner;

public class if_else_if_prog_01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();

        if (age<=10){
            System.out.println("You are a child");
        }
        else if (age>10 && age<=19){
            System.out.println("Your are a teenage person");
        }
        else{
            System.out.println("Your are adult");
        }
    }
}
