import java.util.ArrayList;
import java.util.Scanner;

public class Palindrome {
    public ArrayList<String> solution(int n, String[] str){
        ArrayList<String> answer = new ArrayList<>();
        /**
         *  StringBuilder를 활용한 문자열 뒤집기. 단 특정 단어만 바꾸는 것에는 적합하지 않
         * for (String x : str) {
         *             String tmp = new StringBuilder(x).reverse().toString();
         *             answer.add(tmp);
         *         }
         */


        /**
         * 직접 뒤집는 방법
         */
        for (String x : str) {
            char[] s = x.toCharArray(); //문자열을 뒤집을 수 없기 때문에 문자 배열화
            int lt=0, rt=x.length()-1;
            while (lt < rt) {
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
            String tmp = String.valueOf(s);
            answer.add(tmp);
        }
        return answer;
    }

    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = kb.next();
        }
        for (String x : palindrome.solution(n, str)) {
            System.out.println(x);
        }

    }
}
