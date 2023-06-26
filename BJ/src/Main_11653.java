import java.util.Scanner;

public class Main_11653 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        int num = s.nextInt();
        for (int i=2; i<=num; i++){
            while (num%i==0){
                num=num/i;
                System.out.println(i);
            }
        }
    }

}

