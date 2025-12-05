import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String str = obj.next();

        for(char s : str.toCharArray()) {
            char encoded = (char)('A' + (s - 'A' + 3) % 26);
            System.out.print(encoded);
        }
    }
}