import java.util.Scanner;

public class Averagemarks {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("How many students");
        int n=s.nextInt();
        float[] arr= new float [n];
        float sum=0.0f;
        for(int i=0;i<n;i++){
            System.out.println("Enter physics marks");
            arr[i] = s.nextFloat();
        }
        for(float element: arr){
            sum=sum+element;
        }
        float av=sum/arr.length;
        System.out.println(av);
    }
}



