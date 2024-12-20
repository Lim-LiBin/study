import java.util.*;

public class Main {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[7];
        int sum = 0;
        int min = 100;

        for(int i = 0;i < 7; i++) {
            arr[i] = in.nextInt();
        }

        for(int i = 0; i < 7; i++) {
            if(arr[i] % 2 != 0) {
                sum += arr[i];
                if(arr[i] < min) {
                    min = arr[i];
                }
            }
        }

        if(sum == 0) {
            sum = -1;
        }
        System.out.println(sum);
        if(min != 100) {
            System.out.println(min);
        }
    }
}