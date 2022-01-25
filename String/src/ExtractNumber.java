/**
 * 숫자만 추출
 * 문자와 숫자가 섞여있는 문자열이 주어지면 그 중 숫자만 추출하여 그 순서대로 자연수를 만듭니다.
 * 만약 “tge0a1h205er”에서 숫자만 추출하면 0, 1, 2, 0, 5이고 이것을 자연수를 만들면 1205이 됩니다.
 * 추출하여 만들어지는 자연수는 100,000,000을 넘지 않습니다.
 *
 * 입력
 * 첫 줄에 숫자가 썩인 문자열이 주어집니다. 문자열의 길이는 100을 넘지 않습니다.
 *
 * 출력
 * 첫 줄에 자연수를 출력합니다.
 *
 * 예시 입력 g0en2T0s8eSoft
 * 예시 출력 208
 */

import java.util.Scanner;

public class ExtractNumber {
    public int  solution(String s) {
        /**
         * 아스키 코드로 구현
         * int answer = 0;
         *    for (char x : s.toCharArray()) {
         *         if (x >= 48 && x < 57) {    //48~57가 아스키 코드의 숫자
         *             answer = answer * 10 + (x - 48);
         *         }
         *    }
         */


        /**
         * String 으로 구현
         */
        String  answer = "";
        for (char x : s.toCharArray()) {
            if (Character.isDigit(x)) {
                answer += x;
            }
        }

        return Integer.parseInt(answer);
    }

    public static void main(String[] args) {
        ExtractNumber extractNumber = new ExtractNumber();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(extractNumber.solution(str));
    }
}
