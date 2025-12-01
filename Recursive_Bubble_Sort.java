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
        for(int i=0;i<n;i++)
		{
		    for(int j=0;j<n-1;j++)
		    {
		        if(arr[j]>arr[j+1])
		        {
		            int temp=arr[j];
		            arr[j]=arr[j+1];
		            arr[j+1]=temp;
		        }
		        
		    }
		    
		}
		for(int k=0;k<n;k++)
		    {
		        System.out.print(arr[k]);
		        if(k<n-1)
		        {
		            System.out.print(" ");
		        }
		    }
		
    }
}