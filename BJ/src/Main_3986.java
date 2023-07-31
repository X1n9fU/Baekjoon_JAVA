import java.util.Stack;
import java.util.Scanner;

public class Main_3986 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        Stack<Character> stack = new Stack<>();

        int num = s.nextInt();
        s.nextLine();
        int count=0;
        for (int i=0; i<num; i++){
            stack.clear();
            String word = s.nextLine();
            char [] w = word.toCharArray();

            for (int j=0; j<w.length; j++){
                if (stack.isEmpty()) stack.push(w[j]);
                else if (stack.peek()==w[j]) stack.pop();
                else stack.push(w[j]);
            }
            if (stack.empty()) count++;

        }
        System.out.println(count);
    }
}
