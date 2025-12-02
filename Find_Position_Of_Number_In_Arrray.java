import java.util.Scanner;
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
        int idx=0;
        for(int i=0;i<n;i++)
		{
		    if(arr[i]==m)
		    {
		        idx=i+1;
		    }
		}
		if(idx!=0)
		System.out.print(idx);
		else
		System.out.print("-1");
    }
}