package Ternary_Operator_In_Java;

import java.util.Scanner;

public class even_odd {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your number");
        int num = sc.nextInt();

        String numberIs = (num%2==0) ? "Even" : "Odd";
        System.out.println(numberIs);
    }
}
