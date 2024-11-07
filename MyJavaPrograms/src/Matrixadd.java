import java.util.Scanner;

public class Matrixadd {
    public static void main(String[] args) {
        int [][] arr1= new int[2][3];
        int [][] arr2= new int[2][3];
        int [][] arr3= new int[2][3];
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < arr1.length; i++) {
            for(int j=0;j< arr1[i].length; j++){
                System.out.println("Enter the element for matrix1");
                arr1[i][j] = s.nextInt();
            }
        }
        for(int i=0;i<arr2.length;i++){
            for(int j=0;j< arr2[i].length;j++){
                System.out.println("Enter the element for matrix2");
                arr2[i][j] = s.nextInt();
            }
        }
         for(int i=0;i<arr3.length;i++){
             for(int j=0;j<arr3[i].length;j++){
                 arr3[i][j] = arr1[i][j] + arr2[i][j];
                 System.out.print(arr3[i][j]);
             }
             System.out.println("");
         }





    }
}
