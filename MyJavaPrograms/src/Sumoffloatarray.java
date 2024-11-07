import java.util.Scanner;

public class Sumoffloatarray {
    public static void main(String[] args) {
        float[] arr= new float [5];
        float sum=0.0f;
        Scanner s=new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter the element");
            arr[i]=s.nextFloat();
            sum=sum+arr[i];
        }
        System.out.println(sum);

    }
}
