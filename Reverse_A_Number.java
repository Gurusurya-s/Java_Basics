import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n=obj.nextInt();
        int rev=0;
        while(n>0)
        {
            int d=n%10;
            if(d!=0)
            {
                rev=rev*10+d;
            }
            n/=10;
        }
        System.out.print(rev);
    }
}