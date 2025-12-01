import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String sc = obj.nextLine();
        //System.out.println("The Input Provided is: " + userInput);
        int c=0;
        for(char ch : sc.toCharArray())
        {
            c++;
        }
        System.out.print(c);
    }
}