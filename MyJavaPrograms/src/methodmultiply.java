import java.util.Scanner;

public class methodmultiply {

    static void multiply(int n){
        for(int i=1;i<=10;i++){
            System.out.println(n*i);
        }

    }


    public static void main(String[] args) {
        System.out.println("Enter number");
        Scanner s= new Scanner(System.in);
        int n = s.nextInt();
        multiply(n);
    }
}
