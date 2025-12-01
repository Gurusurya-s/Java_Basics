import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
       
        int n = obj.nextInt();
        int[] arr =new int[n];
        int[] res =new int[n];
        int[] a =new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=obj.nextInt();
        }
        for(int j=0;j<n;j++)
        {
            res[j]=obj.nextInt();
        }
        //Arrays.sort(arr);
        int count=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
            if(arr[i]==res[j])
            {
                a[count]=arr[i];
                count++;
            }
            }
        }
        if(count==0)
        System.out.print("-1");
        else
        {
            for(int i=0;i<count-1;i++)
            {
                System.out.print(a[i]+" ");
            }
            System.out.print(a[count-1]);
        }
    }
}