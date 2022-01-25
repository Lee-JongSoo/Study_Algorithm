/**
 * 5. 특정 문자 뒤집기
 * 영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고,
 * 특수문자는 자기 자리에 그대로 있는 문자열을 만들어 출력하는 프로그램을 작성하세요.
 *
 * 입력
 * 첫 줄에 길이가 100을 넘지 않는 문자열이 주어집니다.
 *
 * 출력
 * 첫 줄에 알파벳만 뒤집힌 문자열을 출력합니다.
 *
 * 예시 입력  a#b!GE*T@S
 * 예시 출력  S#T!EG*b@a
 */

import java.util.Scanner;

public class Palindrome2 {
    public String solution(String str) {
        String answer;
        char[] s = str.toCharArray();  //char 배열 생성
        int lt = 0, rt = str.length()-1;
        while (lt < rt) {
            if (!Character.isAlphabetic(s[lt])) { //알파벳인지 검사
                lt++;
            } else if (!Character.isAlphabetic(s[rt])) {
                rt--;
            }else {
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
        }
        answer = String.valueOf(s);

        return answer;
    }

    public static void main(String[] args) {
        Palindrome2 palindrome2 = new Palindrome2();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(palindrome2.solution(str));
    }
}