import java.util.Scanner;

public class Main_15725 {

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        //언제풀지
        String p = s.nextLine();
        int answer=9999;
        int index = p.indexOf("x");

        if (index==-1){
            answer=0;
        }
        else {
            if (index==0) answer = -1;
            String [] x = p.split("x");

        }

        System.out.print(answer);
    }
}
