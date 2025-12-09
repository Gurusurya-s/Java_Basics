import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String str = obj.next();
        String str1 = obj.next();
        int K = obj.nextInt();
        if(str.length() != str1.length()) {
            System.out.println("no");
            return;
        }
        int diff = 0;
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) != str1.charAt(i)) {
                diff++;
            }
        }

        // Check if exactly K differences
        if(diff == K)
            System.out.println("yes");
        else
            System.out.println("no");
    }
}
