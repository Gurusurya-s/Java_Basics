import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n=obj.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=obj.nextInt();
        }
        int min=arr[0],idx=0;
        for(int i=1;i<n;i++)
		{
		    if(arr[i]<min)
		    {
		        min=arr[i];
		        idx=i;
		    }
		}
		if(idx!=0)
		System.out.print(idx);
		else
		System.out.print("-1");
    }
}