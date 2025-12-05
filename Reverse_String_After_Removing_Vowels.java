import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()) {
            if ("aeiouAEIOU".indexOf(c) == -1)
                sb.append(c);
        }

        if (sb.length() == 0) {
            System.out.println("-1");
        } else {
            System.out.println(sb.reverse().toString());
        }
    }
}
