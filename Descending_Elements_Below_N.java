import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
       
        int n = obj.nextInt();
        int[] arr =new int[n];
        int[] res =new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=obj.nextInt();
        }
        for (int i = 0; i < n - 1; i++) {
    for (int j = i + 1; j < n; j++) {
        if (arr[i] < arr[j]) {   
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]<n)
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