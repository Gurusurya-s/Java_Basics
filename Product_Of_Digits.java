import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n=obj.nextInt();
        int pro=1;
        while(n>0)
        {
            int d=n%10;
            pro*=d;
            n/=10;
        }
        System.out.print(pro);
    }
}