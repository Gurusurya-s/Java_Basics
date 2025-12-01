import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
        Scanner obj = new Scanner(System.in);
        String s1 = obj.next();
        String s2 = obj.next();
        int f = 1;   // assume strings are same

        if (s1.length() != s2.length()) {
            f = 0;
        } else {
            for (int i = 0; i < s1.length(); i++) {
                if (s1.charAt(i) != s2.charAt(i)) {   // FIXED: changed '=' to '!='
                    f = 0;
                    break;
                }
            }
        }

        if (f == 1) {
            System.out.print("yes");
        } else {
            System.out.print("no");
        }
        
    }
}
