import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String inp = obj.next();
        String vow="aeiouAEIOU";
        int f=0;
        for(int i=0;i<inp.length();i++)
        {
            for(int j=0;j<vow.length();j++)
            {
            if(inp.charAt(i)==vow.charAt(j))
            {
                f=1;
            }
            }  
        }
        if(f==1)
        {
            System.out.print("yes");
        }
        else{
            System.out.print("no");
        }
        
       
    }
}