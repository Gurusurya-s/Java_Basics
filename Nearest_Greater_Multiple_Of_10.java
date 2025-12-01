import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        //String userInput = obj.next();
        int x=obj.nextInt();
        int d=x/10;
        d++;
        d*=10;
        System.out.print(d);
    }
}