import java.util.Scanner;

public class Main_10798 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        char [][] arr = new char[5][];

        for(int i=0; i<5; i++) {
            String word = s.nextLine();
            arr[i] = word.toCharArray();
        }

        int max = 0;
        int []len = new int[5];
        for (int i=0; i<5; i++) {
            len[i] = arr[i].length;
            if (max < len[i]) max = len[i];
        }

        int num=0;
        while (num<max) {
            for (int j = 0; j < 5; j++) {
                if (num < len[j]) System.out.print(arr[j][num]);
            }
            num++;
        }
    }
}
