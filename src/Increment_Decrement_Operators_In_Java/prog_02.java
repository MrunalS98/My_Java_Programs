package Increment_Decrement_Operators_In_Java;

public class prog_02 {
    public static void main(String[] args) {

        int a = 10;
        int result = ++a;           // 1st increment will happen
        System.out.println(a);
        System.out.println(result);

        System.out.println("-----------");

        int b = 10;
        int result2 = b++;          // increment will happen afterwords
        System.out.println(b);
        System.out.println(result2);
    }
}
