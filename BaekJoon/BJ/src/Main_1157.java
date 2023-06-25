import java.util.Scanner;
public class Main_1157 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        String w = s.nextLine();
        char [] word = w.toCharArray();
        int [] alp = new int[26];
        for (int i=0; i<word.length; i++){
            word[i] = Character.toUpperCase(word[i]);
            int index = word[i]-'A';
            alp[index]++;
        }
        int max = alp[0];
        int maxindex = 0;
        int count = 1;
        for (int i=1; i<26; i++){
            if (alp[i] > max) {
                max=alp[i];
                maxindex=i;
                count=1;
            }
            else if(alp[i] == alp[maxindex]) count++;
        }

        if (count > 1) System.out.print("?");
        else System.out.print((char)(maxindex+65));



    }
}
