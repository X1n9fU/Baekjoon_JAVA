import java.util.ArrayList;
import java.util.Scanner;

public class Main_11536 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        s.nextLine();

        ArrayList<String> names = new ArrayList<>(20);
        for (int i=0; i<n; i++){
            names.add(s.nextLine());
        }
        char [] name1 = new char[12];
        char [] name2 = new char[12];
        String result ="";
        for (int i=0; i<n-1; i++){
            name1 = names.get(i).toCharArray();
            name2 = names.get(i+1).toCharArray();
            int len = Math.min(name1.length, name2.length);
            if (name1[0] < name2[0]){
                if (result.equals("DECREASING")){
                    result="NEITHER";
                    break;
                } else{
                    result="INCREASING";
                }
            } else if (name1[0] > name2[0]) {
                if (result.equals("INCREASING")){
                    result="NEITHER";
                    break;
                } else{
                    result="DECREASING";
                }
            } else {
                for (int j = 1; j < len; j++) {
                    if (name1[j] < name2[j]) {
                        if (result.equals("DECREASING")){
                            result="NEITHER";
                            break;
                        } else{
                            result="INCREASING";
                        }
                    } else if(name1[j] > name2[j]){
                        if (result.equals("INCREASING")){
                            result="NEITHER";
                            break;
                        } else{
                            result="DECREASING";
                        }
                    }
                }
            }
        }

        System.out.println(result);


    }

}
