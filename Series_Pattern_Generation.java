import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int userInput = obj.nextInt();
        //System.out.println("The Input Provided is: " + userInput);
        for(int i=1;i<=userInput;i++)
        {
            int pro=(i*(i+1))/2;
            int n=pro*pro;
            System.out.printf("%d",n);
            if(i<userInput)
            {
                System.out.print(" ");
            }
        }
    }
}