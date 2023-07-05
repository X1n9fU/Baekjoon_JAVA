import java.util.*;
public class Main_2164 {
    public static void main(Strings[] args){
        Scanner s = new Scanner;

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
        System.out.println(queue.peak());
    }
}
