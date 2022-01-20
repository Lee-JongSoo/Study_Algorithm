import java.util.Scanner;

public class WorldInSentence {
    public static void main(String[] args) {
        WorldInSentence worldInSentence = new WorldInSentence();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(worldInSentence.solution(str));
    }

    public String solution(String str) {
        String answer = "";
        int charNum = Integer.MIN_VALUE, pos;

        /**
         * split() 활용
         */
     /*   String[] s = str.split(" ");
        for (String x : s) {
            int len = x.length();
            if (len > charNum) {
                charNum = len;
                answer = x;
            }
        }*/

        /**
         * index 활용
         */
        while ((pos = str.indexOf(' ')) != -1) {
            String tmp = str.substring(0, pos);
            int len = tmp.length();
            if (len > charNum) {
                charNum = len;
                answer = tmp;
            }
            str = str.substring(pos + 1);
        }
        if (str.length()>charNum) {
            answer = str;
        }
        return answer;
    }
}
