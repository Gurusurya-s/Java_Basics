import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n=obj.nextInt();
        int m=obj.nextInt();
        long pro=(long)n*m;
        long sqrt=(long)Math.sqrt(pro);
        if((sqrt*sqrt)==pro)
        {
            System.out.print("yes");
        }
        else{
            System.out.print("no");
        }
    }
}