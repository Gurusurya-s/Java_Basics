import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n=obj.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=obj.nextInt();
        }
        int xor=0;
        for(int i=0;i<n;i++)
        {
            xor^=a[i];
        }
        System.out.print(xor);
    }
}