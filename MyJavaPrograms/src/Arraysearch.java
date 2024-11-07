import java.util.Scanner;

public class Arraysearch {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the element");
            arr[i] = s.nextInt();
        }
        System.out.println("Enter the element to be found");
        int n=s.nextInt();
        for(int j=0;j<arr.length;j++){
            if(n==arr[j]){
                System.out.println("Item found");
                break;
            }
            else{
                continue;
            }
        }
    }
}
