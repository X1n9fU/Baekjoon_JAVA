import java.util.Scanner;
public class Main_2587 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        int p[] = new int[5];
        for (int i=0; i<5; i++){
            p[i] = s.nextInt();
        }
        for (int i=0; i<5; i++){
            for (int j=i; j<5; j++){
                if (p[i] > p[j]){
                    int temp = p[i];
                    p[i] = p[j];
                    p[j] = temp;
                }
            }
        }
        int sum=0;
        for (int i=0; i<5; i++) sum+=p[i];
        System.out.println(sum/5);
        System.out.println(p[2]);

    }
}
