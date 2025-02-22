package Array_In_Java;

public class TwoD_Array_Prog1 {
    public static void main(String[] args) {

        int [][] num = {{1,2,3},{4,5,6}};

        for (int i=0; i<2; i++){
            for (int j=0; j<3; j++){
                System.out.println(num [i][j] + " ");
            }
            System.out.println();
        }
        //System.out.println();
    }
}
