import java.util.Scanner;
public class Main_25206 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        double sumOfSG = 0;
        double sumOfScore=0;
        for(int i=0; i<20; i++){
            String [] temp = s.nextLine().split(" ");
            double score = Double.parseDouble(temp[1]);
            sumOfScore+=score;
            String grade = temp[2];
            switch(grade) {
                case "A+": score=score*4.5; break;
                case "A0": score=score*4.0; break;
                case "B+": score=score*3.5; break;
                case "B0": score=score*3.0; break;
                case "C+": score=score*2.5; break;
                case "C0": score=score*2.0; break;
                case "D+": score=score*1.5; break;
                case "D0": score=score*1.0; break;
                case "F": score=score*0.0; break;
                case "P": sumOfScore-=score; score=score*0.0; break;
            }
            sumOfSG+=score;
        }
        double answer = sumOfSG/sumOfScore;
        System.out.print(answer);


    }
}
