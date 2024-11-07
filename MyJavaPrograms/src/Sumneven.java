import java.util.Scanner;

public class Sumneven {
    public static void main(String[] args) {
        int c=0;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number till which you need the sum ");
        int n = s.nextInt();
        for(int i=0;i<n;i++){
            c=c+(2*i);
        }
        System.out.printf("%d",c);

    }
}
