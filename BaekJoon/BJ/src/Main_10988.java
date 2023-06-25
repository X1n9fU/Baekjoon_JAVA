import java.util.Scanner;
public class Main_10988 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        String w = s.nextLine();
        char [] word = w.toCharArray();
        boolean isPalindrome = true;
        for (int i=0; i<word.length/2; i++){
            if (word[i] != word[word.length-1-i]){
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) System.out.print(1);
        else System.out.print(0);
    }
}
