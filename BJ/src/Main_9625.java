import java.util.Scanner;

public class Main_9625 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        int num = s.nextInt();

        int [][] arr = new int [2][46];

        arr[0][0] = 0;
        arr[0][1] = 1;
        arr[1][0] = 1;
        arr[1][1] = 1;

        for (int i=0; i<num; i++){
            if (i>1) {
                arr[0][i] = arr[0][i-1] + arr[0][i-2];
                arr[1][i] = arr[1][i-1] + arr[1][i-2];
            }
        }
        System.out.print(arr[0][num-1]+" "+arr[1][num-1]);




    }
}
