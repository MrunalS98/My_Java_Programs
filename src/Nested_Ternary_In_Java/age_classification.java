package Nested_Ternary_In_Java;

import java.util.Scanner;

public class age_classification {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();

        String Result = (age<=18)? "You Are Minor" : (age<=65) ? "You Are adult" : "You are Senior";

        System.out.println(Result);
    }
}
