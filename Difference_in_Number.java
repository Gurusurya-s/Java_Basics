import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int m=obj.nextInt();
        int n=obj.nextInt();
        int c=n-m;
        int d=m-n;
        if(n>m)
        System.out.print(c);
        else
        System.out.print(d);
    }
}