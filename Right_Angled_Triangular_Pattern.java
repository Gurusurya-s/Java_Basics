import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int userInput = obj.nextInt();
        //System.out.println("The Input Provided is: " + userInput);
        for(int i=0;i<userInput;i++)
        {
            for(int j=1;j<=(2*i+1);j++)
            {
                System.out.print("1");
                if(j<=(2*i+1)-1)
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}