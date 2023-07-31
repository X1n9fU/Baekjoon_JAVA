import java.util.Scanner;
public class Main_2167 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();
        int M = s.nextInt();

        int [][]arr=new int[N][M];

        for (int i=0; i<N; i++){
            for (int j=0; j<M; j++){
                arr[i][j] = s.nextInt();
            }
        }

        int K = s.nextInt();

        for (int num=0; num<K; num++){
            int i=s.nextInt();
            int j=s.nextInt();
            int x=s.nextInt();
            int y=s.nextInt();
            int sum = 0;

            for (int n=i-1; n<x; n++){
                for (int m=j-1; m<y; m++){
                    sum += arr[n][m];
                }
            }
            System.out.println(sum);


        }



    }
}
