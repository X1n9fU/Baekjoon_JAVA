import java.util.Scanner;
public class Main_7568 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        int num = s.nextInt();
        int [][]size = new int[num][3];
        for (int i=0; i<num; i++){
            size[i][0] = s.nextInt();
            size[i][1] = s.nextInt();
            size[i][2] = 1;
        }

        for (int i=0; i<num; i++){
            for (int j=0; j<num; j++){
                if (size[i][0] < size[j][0] && size[i][1] < size[j][1]){
                    size[i][2]++;
                }
            }
            System.out.print(size[i][2]+" ");
        }

    }
}
