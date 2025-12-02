import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = obj.nextInt();

        int maxLen = 1, curr = 1;

        for (int i = 1; i < n; i++) {
            if (arr[i] == arr[i - 1])
                curr++;
            else {
                if (curr > maxLen)
                    maxLen = curr;
                curr = 1;
            }
        }

        if (curr > maxLen)
            maxLen = curr;

        if (maxLen == 1)
            System.out.print("-1");
        else
            System.out.print(maxLen);
    }
}