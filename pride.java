package New;

import java.util.Scanner;

public class New {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if (n > 0) {
            int[] array = new int[n];
            for (int x = 0; x < n; x++) {
                array[x] = s.nextInt();
            }
            if (n % 2 != 0) {
                for (int i = 0; i < n; i++) {
                    System.out.println(array[i]);
                }
            }
            if (n % 2 == 0) {
                for (int y = array.length - 1; y >= 0; y--) {
                    System.out.println(array[y]);
                }
            }
        }
    }
}