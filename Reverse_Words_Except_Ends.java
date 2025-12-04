import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String[] words = s.split(" ");
        StringBuilder ans = new StringBuilder();

        for (String w : words) {
            if (w.length() <= 2) {
                ans.append(w);
            } else {
                char first = w.charAt(0);
                char last = w.charAt(w.length() - 1);
                String mid = new StringBuilder(w.substring(1, w.length() - 1)).reverse().toString();
                ans.append(first).append(mid).append(last);
            }
            ans.append(" ");
        }

        System.out.println(ans.toString().trim());
    }
}
