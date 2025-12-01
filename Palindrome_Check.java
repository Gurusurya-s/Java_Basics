import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String str=obj.next();
        int left=0;
        int right=str.length()-1;
        boolean isPalindrome=true;
        while(left<right)
        {
            if(str.charAt(left)!=str.charAt(right))
            {
                isPalindrome=false;
                break;
            }
            left++;
            right--;
        }
        if(isPalindrome)
        {
            System.out.print("yes");
        }
        else{
            System.out.print("no");
        }
        
    }
}