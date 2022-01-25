/**
 * 6. 중복문자제거
 * 소문자로 된 한개의 문자열이 입력되면 중복된 문자를 제거하고 출력하는 프로그램을 작성하세요.
 * 중복이 제거된 문자열의 각 문자는 원래 문자열의 순서를 유지합니다.
 *
 * 입력
 * 첫 줄에 문자열이 입력됩니다. 문자열의 길이는 100을 넘지 않는다.
 *
 * 출력
 * 첫 줄에 중복문자가 제거된 문자열을 출력합니다.
 *
 * 예시 입력  ksekkset
 * 예시 출력  kset
 */

import java.util.Scanner;

public class Duplicate {
    public String solution(String str) {
        String answer = "";
        for (int i = 0; i < str.length(); i++) {
            /**
             * System.out.println(str.charAt(i)+ " " + i + " " + str.indexOf(str.charAt(i))); //중복문자 test
             */
            if (str.indexOf(str.charAt(i))== i) { //중복 문자 검사 -> 처음 발견된 index와 나중 발견된 인덱스는 서로 다르기 때문에, 즉 서로 두 값이 다르면 중복 문자가 된다.
                answer += str.charAt(i);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Duplicate duplicate = new Duplicate();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(duplicate.solution(str));
    }
}
