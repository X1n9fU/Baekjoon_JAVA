import java.util.Scanner;
public class Main_9095 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        int num = s.nextInt();

        int [] answer = new int[11];

        answer[1] = 1;
        answer[2] = 2;
        answer[3] = 4;

        for (int i=0; i<num; i++){
            int Integer = s.nextInt();
            if (Integer > 3){
                for (int j = 4; j <=Integer; j++) {
                    answer[j] = answer[j-3] + answer[j-2] + answer[j-1];
                }
            }
            System.out.println(answer[Integer]);
        }

    }
}
