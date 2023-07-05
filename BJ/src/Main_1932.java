import java.util.Scanner;
public class Main_1932 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();
        int [][]arr = new int[N][N];
        int [][]sum = new int[N][N];

        for(int i=0; i<N; i++){
            for(int j=0; j<i+1; j++){
                arr[i][j] = s.nextInt();
            }
        }

        sum[0][0] = arr[0][0];
        for(int i=1; i<N; i++){
            for(int j=0; j<i+1; j++){
                if (j==0) sum[i][j] = sum[i-1][j] + arr[i][j];
                else if (j==i) sum[i][j] = sum[i-1][j-1] + arr[i][j];
                else sum[i][j] = Math.max(sum[i-1][j-1], sum[i-1][j]) + arr[i][j];
            }
        }
        int max = sum[N-1][0];
        for (int i=0; i<N; i++){
            if (max < sum[N-1][i]) max=sum[N-1][i];
        }

        System.out.println(max);

    }
}
