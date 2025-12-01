import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
        //Getting input via STDIN
        Scanner obj = new Scanner(System.in);
        int a=obj.nextInt();
        int b=obj.nextInt();
        int c=obj.nextInt();
        if(a>b&&a<c)
        {
            System.out.print("yes");
        }
        else{
            System.out.print("no");
        }

    }
}