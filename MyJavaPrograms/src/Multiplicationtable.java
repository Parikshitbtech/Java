import java.util.Scanner;

public class Multiplicationtable {
    public static void main(String[] args) {
        int i=1;
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the number");
        int n=s.nextInt();
        while(i<=10){
            System.out.printf("%d * %d= %d \n",n,i,n*i);
            i++;
        }

    }
}
