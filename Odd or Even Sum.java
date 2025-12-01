import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       
        Scanner obj = new Scanner(System.in);
        int n=obj.nextInt();
        int m=obj.nextInt();
        int c=n+m;
        if(c%2==0)
        {
            System.out.print("even");
        }
        else
        {
            System.out.println("odd");
        }
    }
}