import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String str = obj.nextLine();
        String s = obj.next();
        String[] str1=str.split(" ");
        int c=0;
        for(int i=0;i<str1.length;i++)
        {
            if(str1[i].equals(s))
            {
                c++;
            }
        }
        if(c>=1)
        {
            System.out.print(c);
        }
        else
        System.out.print("-1");
    }
}