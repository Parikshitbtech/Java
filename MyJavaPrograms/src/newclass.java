import java.util.Scanner;


class Cellphone {
    void ring() {
        System.out.println("Ringing......");
        ;
    }

    void vibrate() {
        System.out.println("Vibrating......");
    }
}

class Square(){
    float side;
    double area(float s){
        return s*s;
    }

    double perimeter(int s){
        return s*4;
    }
}


public class newclass {
    public static void main(String[] args) {
        Scanner c= new Scanner(System.in);
        Cellphone Hehe = new Cellphone();
        Hehe.ring();
        Hehe.vibrate();
        Square calc = new Square();
        calc.side = 4;
        System.out.println("The area is "+ calc.area(calc.side));
        System.out.println("The perimeter is "+ calc.perimeter(calc.side));

    }




}
