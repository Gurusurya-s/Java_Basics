import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n=str.length();
        if(n%2==1)
        {
            int mid=n/2;
            str=str.substring(0,mid)+"*"+str.substring(mid+1,n);
        }
        else
        {
            int mid1=n/2-1;
            int mid2=n/2;
            str=str.substring(0,mid1)+"**"+str.substring(mid2+1,n);
        }
        System.out.print(str);
    }
}