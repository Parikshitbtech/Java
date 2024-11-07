public class Mininarray {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 6, 9, 5};
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max > arr[i]) {
                max = arr[i];
            }
        }
        System.out.printf("%d is the minimum element", max);
    }
}
