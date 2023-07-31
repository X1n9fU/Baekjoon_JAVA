import java.util.Scanner;
import java.util.Stack;

public class Main_4949 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Stack<Character> stack = new Stack();
        String result = "";
        char[] arr = new char[100];
        while (true) {
            result="yes";
            stack.clear();
            String word = s.nextLine();
            arr = word.toCharArray();
            if (arr.length == 1 && arr[0] == '.') return;

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == '[' || arr[i] == '(' ) stack.push(arr[i]);

                if (arr[i]==']') {
                    if (stack.isEmpty() || stack.pop() != '[') {
                        result="no";
                        break;
                    }
                } else if (arr[i] == ')') {
                    if (stack.isEmpty() || stack.pop() !='(') {
                        result="no";
                        break;
                    }
                }
            }
            if (!stack.isEmpty()) result="no";

            System.out.println(result);
        }

    }
}

