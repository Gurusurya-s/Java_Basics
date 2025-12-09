import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String str = obj.next();

        int balance = 0;

        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '(')
                balance++;
            else
                balance--;
                
            if(balance < 0) {
                System.out.println("no");
                return;
            }
        }
        if(balance == 0)
            System.out.println("yes");
        else
            System.out.println("no");
    }
}
