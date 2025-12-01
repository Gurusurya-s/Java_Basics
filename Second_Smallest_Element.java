import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Getting input via STDIN
        Scanner obj = new Scanner(System.in);
        int n=obj.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=obj.nextInt();
        }
        int fmin=Integer.MAX_VALUE;
        int smin=Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            if(arr[i]<fmin)
            {
                smin=fmin;
                fmin=arr[i];
            }
            else if(arr[i]>fmin&&arr[i]<smin)
            {
                smin=arr[i];
            }
        }
        if(smin==Integer.MAX_VALUE)
        {
            System.out.print("-1");
        }
        else
        System.out.print(smin);
    }
}