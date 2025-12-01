import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int num=obj.nextInt();
        if(num<=1)
        {
            System.out.print("no");
        }
        boolean isprime=true;
        for(int i=2;i*i<=num;i++)
        {
            if(num%i==0)
            {
                isprime=false;
            }
        }
        System.out.print(isprime?"yes":"no");
    }
}