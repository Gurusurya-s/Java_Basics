import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
        Scanner obj = new Scanner(System.in);
        int n=obj.nextInt();
        int pow=1;
        while(pow<=n)
        {
            pow*=2;
        }
        System.out.printf("%d",pow);
    }
}