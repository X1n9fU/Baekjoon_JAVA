import java.util.Scanner;

public class Main_10972 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int num = s.nextInt();

        int[] number = new int[num];

        for (int i = 0; i < num; i++) {
            number[i] = s.nextInt();
        }


        int idx = num-1;
        boolean check = true;
        while (idx > 0 && number[idx-1] >= number[idx]) idx--;

        if (idx<=0) check=false;
//        for(int i=num-1; i>0; i--){
//            if (number[i] > number[i-1]) {
//                check=true;
//                idx=i-1;
//                break;
//            }
//        }

        if (check) {
            int point = num-1;
            while (number[point] <= number[idx-1])
                point--;

            int tmp = number[idx-1];
            number[idx-1] = number[point];
            number[point] = tmp;

            for (int j=idx; j<num; j++){
                for (int i=j; i<num; i++){
                    if (number[j] > number[i]) {
                        int m = number[j];
                        number[j] = number[i];
                        number[i] = m;
                    }
                }
            }

            for(int i=0; i<num; i++) System.out.print(number[i]+" ");

        } else{
            System.out.println(-1);
        }

    }
}
