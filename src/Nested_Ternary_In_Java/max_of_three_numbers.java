package Nested_Ternary_In_Java;

import java.util.Scanner;

public class max_of_three_numbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your 1st number");
        int num1 = sc.nextInt();

        System.out.println("Enter your 2nd number");
        int num2 = sc.nextInt();

        System.out.println("Enter your 3rd number");
        int num3 = sc.nextInt();

       //String maxNumberIs = (num1>num2)? ((num1>num3)?"num1 greater" :(num2>num3):"num2 is greater"): "num3 is greater";

        int largest = (num1 >= num2) ? ((num1 >= num3) ? num1 : num3) : ((num2 >= num3) ? num2 : num3) ;
        System.out.println("Grater number is" + largest);
    }
}
