import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] a = new int[N];

        for (int i = 0; i < N; i++)
            a[i] = sc.nextInt();

        K %= N;

        for (int i = N - K; i < N; i++)
            System.out.print(a[i] + " ");

        for (int i = 0; i < N - K; i++){
            System.out.print(a[i]);
            if(i<N-K-1)
            {
                System.out.print(" ");
            }
        }
    }
}
