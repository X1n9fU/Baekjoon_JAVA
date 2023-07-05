import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class Main_2164 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        Queue<Integer> queue = new LinkedList<>();

        int num = s.nextInt();

        for (int i=1; i<=num; i++){
            queue.add(i);
        }

        int count = num;
        while (count != 1){
            queue.poll();
            int top = queue.poll();
            queue.add(top);
            count--;
        }
        System.out.println(queue.peek());
    }
}
