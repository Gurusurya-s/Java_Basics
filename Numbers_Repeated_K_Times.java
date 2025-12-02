import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n=obj.nextInt();
        int m=obj.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=obj.nextInt();
        }
        Arrays.sort(arr);
        int idx=0,c=1;
        int[] res=new int[n];
        for(int i=1;i<n;i++)
        {
            if(arr[i]==arr[i-1])
            {
                c++;
            }
            else
            {
                if(c==m)
                {
                    res[idx++]=arr[i-1];
                    c=1;
                }
            }
        }
        if(c==m)
        res[idx++]=arr[n-1];
        if(idx==0)
        System.out.print("-1");
        for(int i=0;i<idx;i++)
        {
            System.out.print(res[i]);
            if(i<idx-1)
            {
                System.out.print(" ");
            }
        }
        
    }
}