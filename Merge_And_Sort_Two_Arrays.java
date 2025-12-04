import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        int n = obj.nextInt();
        int m = obj.nextInt();

        int[] arr1 = new int[n];
        int[] arr2 = new int[m];

        for (int i = 0; i < n; i++) {
            arr1[i] = obj.nextInt();
        }

        for (int i = 0; i < m; i++) {
            arr2[i] = obj.nextInt();
        }

        int[] merged = new int[n + m];
        for (int i = 0; i < n; i++) merged[i] = arr1[i];
        for (int i = 0; i < m; i++) merged[n + i] = arr2[i];

        Arrays.sort(merged);
        for (int i=0;i<n+m;i++) {
            System.out.print(merged[i]);
            if(i<(m+n-1))
            {
                System.out.print(" ");
            }
        }
    }
}
