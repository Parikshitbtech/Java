import java.util.Scanner;

public class Reversearray {
    public static void main(String[] args) {
        int [] arr={2,6,7,4,5};
        int temp;
        for(int i=0;i<arr.length/2;i++){
            int j = arr.length - 1 - i;
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }

        for(int k=0;k< arr.length;k++){
            System.out.printf("%d ",arr[k]);
        }
    }
}
