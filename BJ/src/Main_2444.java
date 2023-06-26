import java.util.Scanner;

public class Main_2444 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        int num = s.nextInt();
        int space = num;
        int j=0;
        for (int i=0; i<num; i++){
            for (j=1; j<=2*num-1; j++){
                if (j<space) System.out.print(" ");
                else if (j>2*num-space) {
                    System.out.print(" ");
                    break;
                }
                else System.out.print("*");
            }
            System.out.println();
            space--;
        }
        space=2;
        for (int i=0; i<num-1; i++){
            for (j=1; j<=2*num-1; j++){
                if (j<space) System.out.print(" ");
                else if (j>2*num-space) {
                    System.out.print(" ");
                    break;
                }
                else System.out.print("*");
            }
            System.out.println();
            space++;
        }
    }
}
