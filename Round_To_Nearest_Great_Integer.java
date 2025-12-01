import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Getting input via STDIN
        Scanner obj = new Scanner(System.in);
        double num=obj.nextDouble();
        int n=(int)Math.ceil(num);
        System.out.print(n);
        
    }
}