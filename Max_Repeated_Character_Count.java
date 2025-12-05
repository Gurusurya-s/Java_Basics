import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int[] freq = new int[256];
        int max = 0;

        for (char c : s.toCharArray()) {
            freq[c]++;
            if (freq[c] > max)
                max = freq[c];
        }

        System.out.println(max == 1 ? 0 : max);
    }
}
