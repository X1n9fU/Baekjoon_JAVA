import java.util.Scanner;

public class Main_10813 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int M = s.nextInt();

        int [] basket = new int[N];

        for(int i=1; i<=N; i++){
            basket[i-1] = i;
        }

        for (int i=0; i<M; i++){
            int a = s.nextInt();
            int b = s.nextInt();
            int temp = basket[a-1];
            basket[a-1] = basket[b-1];
            basket[b-1] = temp;
        }

        for (int i=0; i<N; i++){
            System.out.print(basket[i]);
            System.out.print(" ");
        }

    }
}
