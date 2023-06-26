import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main_11728 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String []size = br.readLine().split(" ");
        int aSize = Integer.parseInt(size[0]);
        int bSize = Integer.parseInt(size[1]);

        int c[] = new int[aSize + bSize];
        String [] a = br.readLine().split(" ");
        String [] b = br.readLine().split(" ");
        for (int i = 0; i < aSize; i++) c[i] = Integer.parseInt(a[i]);
        for (int i = 0; i < bSize; i++) c[i + aSize] = Integer.parseInt(b[i]);

        Arrays.sort(c);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < aSize + bSize; i++) {
            sb.append(c[i]).append(" ");
        }
        System.out.println(sb);
    }
}
