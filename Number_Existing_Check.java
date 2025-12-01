import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n=obj.nextInt();
        int k=obj.nextInt();
        int[] ele=new int[n];
        for(int i=0;i<n;i++)
        {
            ele[i]=obj.nextInt();
        }
        int f=0;
        for(int i=0;i<n;i++)
        {
            if(ele[i]==k)
            {
                f=1;
            }
        }
        if(f==1)
        {
            System.out.print("yes");
        }
        else{
            System.out.print("no");
        }
    }
}