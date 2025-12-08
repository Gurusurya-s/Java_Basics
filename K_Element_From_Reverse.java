import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().split(" ");
        LinkedList<Integer> list = new LinkedList<>();
        for (String s : arr) {
            list.add(Integer.parseInt(s));
        }
        int k = sc.nextInt();
        int index = list.indexOf(k);
        if (index == -1) {
            System.out.println("Element not found");
            return;
        }
        int reversePos = list.size() - index;
        System.out.println(reversePos);
    }
}
