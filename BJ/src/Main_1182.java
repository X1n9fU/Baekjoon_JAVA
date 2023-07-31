import java.util.Scanner;
public class Main_1182 {
    public static int count=0;
    public static int num;
    public static int sum;
    public static int []number;

    public static void DFS(int i, int cnt){
        if (i==num) {
            if (cnt == sum) count++;
            return;
        }
        DFS(i+1, cnt);
        DFS(i+1, cnt+number[i]);

    }

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        num = s.nextInt();
        sum = s.nextInt();
        number  = new int[num];
        for(int i = 0; i<num; i++){
            number[i] = s.nextInt();
        }

        DFS(0,0); //합이 0부터 시작

        if (sum == 0) System.out.println(count-1);
        else System.out.println(count);


    }
}
// ex) 1,2
//        0
//       / \
//      1   0
//     / \  / \
//    12 1  2  0
//마지막에 있는 노드들이 부분집합
