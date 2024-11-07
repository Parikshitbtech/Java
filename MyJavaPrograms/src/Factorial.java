import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int f=1,i=1;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=s.nextInt();
        while(i<=n){
            f=f*i;
            i++;
        }
        System.out.println(f);

    }
}
