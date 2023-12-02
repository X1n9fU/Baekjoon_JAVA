import java.util.Objects;
import java.util.Scanner;


class Nick_Chat{
    String nickname;
    String chat;
}
public class Main_20362 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();
        String theAnswer = s.nextLine().strip();

        String answer = "";
        int cnt = 0;
        Nick_Chat [] nickChats = new Nick_Chat[N];

        for (int i=0; i<N; i++){
            nickChats[i] = new Nick_Chat();
            String nick_chat = s.nextLine();
            int length = nick_chat.indexOf(' ');
            nickChats[i].nickname = nick_chat.substring(0,length);
            nickChats[i].chat = nick_chat.substring(length+1);

            if (theAnswer.equals(nickChats[i].nickname))
                answer = nickChats[i].chat;
        }

        for (int i=0; i<N; i++){
            if (nickChats[i].nickname.equals(theAnswer)) break;
            if (nickChats[i].chat.equals(answer)) cnt++;
        }

        System.out.println(cnt);
    }
}
