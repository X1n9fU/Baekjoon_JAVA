import java.util.Scanner;

public class Main_2609 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int m = s.nextInt();

        int rhddirtn=1;
        int rhdqotn=0;

        for (int i=2; i<=n; i++){
            if (n%i==0 && m%i==0) rhddirtn=i;
        }

        for (int i=m*n; i>0; i--){
            if (i%m==0 && i%n==0) rhdqotn=i;
        }

        System.out.println(rhddirtn);
        System.out.println(rhdqotn);

    }
}
