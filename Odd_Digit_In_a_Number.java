import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        boolean found = false;
        StringBuilder result = new StringBuilder();
        for (char c : s.toCharArray()) {
            if ((c - '0') % 2 == 1) {   // odd digit check
                if (found) result.append(" ");
                result.append(c);
                found = true;
            }
        }
        if (found)
            System.out.println(result);
        else
            System.out.println("-1");
        sc.close();
    }
}