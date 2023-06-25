import java.util.Scanner;

public class Main_1292 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] num = new int[1000];
        int a=sc.nextInt();
        int b=sc.nextInt();
        int ans=0;
        int k=0;
        int i=1;
        while (true) {
            for (int j = 1; j <= i; j++) {
                num[k++] = i;
                if (k==1000)
                    break;
            }
            if (k==1000)
                break;
            i++;

        }
        for (int u=a; u<=b; u++){
            ans+=num[u-1];
        }

        System.out.println(ans);
    }
}