public class Stars {
    public static void main(String[] args) {
        for(byte i=4;i>=1;i--) {
            for (byte j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.printf("\n");
        }
    }
}
