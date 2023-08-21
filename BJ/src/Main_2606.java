import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

public class Main_2606 {

    public static void BFS(int v, ArrayList<Vector<Integer>> network, int [] visited){

        for (int i=0; i<network.get(v).size(); i++) {
            int edge = network.get(v).get(i);
            if (visited[edge] == 0) {
                visited[edge] = 1;
                count++;
                BFS(edge, network, visited);
            }
        }
    }


    static int count=0;

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);


        int com = s.nextInt();
        int net = s.nextInt();

        ArrayList<Vector<Integer>> network = new ArrayList<>(com+1);
        int [] visited = new int[com+1];
        visited[1]=1;

        for (int i=0; i<com+1; i++){
            Vector<Integer> v = new Vector<>();
            network.add(v);
        }


        for(int i=0; i<net; i++){
            int e1 = s.nextInt();
            int e2 = s.nextInt();
            network.get(e1).add(e2);
            network.get(e2).add(e1);
        }

        BFS(1, network, visited);

        System.out.println(count);


    }
}
