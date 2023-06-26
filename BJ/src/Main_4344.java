import java.util.Scanner;
public class Main_4344 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        double [] stu = new double[num];
        for (int i=0; i<num; i++){
            int student = s.nextInt();
            int [] score = new int[student];
            double upaverage=0;
            int sc = 0;
            for (int j=0; j<student; j++){
                score[j] = s.nextInt();
                sc += score[j];
            }
            sc = sc/student;
            for (int j=0; j<student; j++){
                if (score[j]>sc) upaverage++;
            }
            double ave = (upaverage/student)*100;
            stu[i]=ave;
        }
        for (int i=0; i<num; i++) System.out.println(String.format("%.3f",stu[i])+"%");

    }
}
