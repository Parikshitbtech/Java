import java.util.Scanner;

public class recursivesum {

    static int sum(int n){
        if(n==0){
            return n;
        }
        else{
            return n+ sum(n-1);
        }
    }




    public static void main(String[] args) {
        System.out.println("Enter number of natural numbers");
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        System.out.println(sum(n));
    }

}
