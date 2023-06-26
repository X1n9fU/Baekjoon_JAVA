import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_14222 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int size = Integer.parseInt(st.nextToken());
        int plusNum = Integer.parseInt(st.nextToken());
        boolean rightnum = true;

        String[] a = br.readLine().split(" ");
        Arrays.sort(a);

        int [] a1 = new int[size];
        for (int i=0; i<size; i++) a1[i] = Integer.parseInt(a[i]);

        for (int i = 0; i < size; i++) {
            while (a1[i] != i+1) {
                a1[i] += plusNum;
                Arrays.sort(a1);
                if (a1[i] > size) {
                    rightnum = false;
                    break;
                }
            }
        }
        if (rightnum) System.out.print("1");
        else System.out.print("0");
    }
}
