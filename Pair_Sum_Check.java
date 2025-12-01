import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int x=obj.nextInt();
        int y=obj.nextInt();
        int[] arr=new int[x];
        int f=0;
        for(int i=0;i<x;i++)
        {
            arr[i]=obj.nextInt();
        }
        for(int i=0;i<x;i++)
        {
            for(int j=0;j<x;j++)
            {
                if((arr[i]+arr[j])==y&&i!=j)
                {
                    f=1;
                }
            }
        }
        if(f==1)
        {
            System.out.print("yes");
        }
        else
        {
            System.out.print("no");
        }
    }
}