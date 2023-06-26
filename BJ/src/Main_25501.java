import java.util.Scanner;

public class Main_25501 {

    static int count=0;

    public static int recursion(String s, int l, int r){
        count++;
        if(l >= r) return 1;
        else if(s.charAt(l) != s.charAt(r)) return 0;
        else return recursion(s, l+1, r-1);
    }
    public static int isPalindrome(String s){
        return recursion(s, 0, s.length()-1);
    }


    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        int num = s.nextInt();
        s.nextLine();

        int []palindrome = new int[num];
        int []recursion = new int[num];

        for (int i=0; i<num; i++) {
            String pd = s.nextLine();
            palindrome[i] = recursion(pd, 0, pd.length()-1);
            recursion[i] = count;
            count = 0;
        }
        for (int i=0; i<num; i++){
            System.out.print(palindrome[i]+" "+recursion[i]);
            System.out.println();
        }

    }
}

