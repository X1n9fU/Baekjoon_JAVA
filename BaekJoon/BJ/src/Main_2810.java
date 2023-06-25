import java.util.Scanner;

public class Main_2810 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numOfSeat = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        int num = 0;
        boolean couple = false;
        char [] seat = s.toCharArray();

        for (int i=0; i<numOfSeat; i++){
            if (seat[i] == 'S' ){
                num+=1;
            }
            if (seat[i] == 'L'){
                if (seat[++i] == 'L') {
                    num += 1;
                    couple = true;
                }
            }
        }
        if (couple)
            num+=1;

        System.out.println(num);
    }
}
