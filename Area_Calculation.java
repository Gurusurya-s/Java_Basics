import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        float n=obj.nextFloat();
        float m=obj.nextFloat();
        float c=n*m;
        System.out.printf("%.5f",c);
    }
}