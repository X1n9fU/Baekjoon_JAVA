import java.util.Scanner;
import java.util.Stack;
public class Main_10773 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        Stack <Integer> stack = new Stack<Integer>();

        int num = s.nextInt();
        int sum = 0;
        for (int i=0; i<num; i++){
            int n = s.nextInt();
            if (n==0) stack.pop();
            else stack.push(n);
        }

        while(!stack.isEmpty()){
            sum += stack.pop();
        }

        System.out.println(sum);

    }
}
