import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
       
        int n = obj.nextInt();
        int k = obj.nextInt();
        int[] arr =new int[n];
        int[] res =new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=obj.nextInt();
        }
        Arrays.sort(arr);
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]<k)
            {
                res[count]=arr[i];
                count++;
            }
        }
        if(count==0)
        System.out.print("-1");
        else
        {
            for(int i=0;i<count-1;i++)
            {
                System.out.print(res[i]+" ");
            }
            System.out.print(res[count-1]);
        }
    }
}
