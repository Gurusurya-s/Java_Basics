import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int m=obj.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = obj.nextInt();
            
        int idx=n-m;
        for(int i=0;i<idx;i++)
        {
            System.out.print(arr[i]);
            if(i<idx-1)
            {
                System.out.print(" ");
            }
        }
        
    }
}
