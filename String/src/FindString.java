import java.util.Locale;
import java.util.Scanner;

public class FindString {
    public int solution(String str, char t) {
        int answer = 0;
        str = str.toUpperCase();
        t = Character.toUpperCase(t);
        //System.out.println(str + " " + t);

        /** for문
         *
         * for (int i = 0; i < str.length(); i++) {
         *             if (str.charAt(i) == t) answer++;
         *         }
         */

        //for each
        for (char x : str.toCharArray()) { //문자 배열 생성
            if (x==t) answer++;
        }


        return answer;
    }

    public static void main(String[] args) {
        FindString findString = new FindString();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        char c = kb.next().charAt(0);
        System.out.print(findString.solution(str, c));
    }
}
