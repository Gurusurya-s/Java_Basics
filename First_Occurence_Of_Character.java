import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String sc = obj.next();
        //System.out.println("The Input Provided is: " + userInput);
        char k=obj.next().charAt(0);
        int f=0;
        int fo=0;
        for(int i=0;i<sc.length();i++)
        {
            if(sc.charAt(i)==k)
            {
                f=1;
                fo=i+1;
                break;
            }
        }
        if(f==1)
        System.out.printf("%d",fo);
        else
        System.out.print("-1");
    }
}