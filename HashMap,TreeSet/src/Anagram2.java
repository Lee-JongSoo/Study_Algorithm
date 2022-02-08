import java.util.HashMap;
import java.util.Scanner;

/**
 * 모든 아나그램 찾기(Hash, Two Pointers, Sliding Window)
 * S문자열에서 T문자열과 아나그램이 되는 S의 부분문자열의 개수를 구하는 프로그램을 작성하세요.
 * 아나그램 판별시 대소문자가 구분됩니다. 부분문자열은 연속된 문자열이어야 합니다.
 *
 * 입력
 * 첫 줄에 첫 번째 S문자열이 입력되고, 두 번째 줄에 T문자열이 입력됩니다.
 * S문자열의 길이는 10,000을 넘지 않으며, T문자열은 S문자열보다 길이가 작거나 같습니다.
 *
 * 출력
 * S단어에 T문자열과 아나그램이 되는 부분문자열의 개수를 출력합니다.
 *
 * 예시 입력 bacaAacba
           abc
 * 예시 출력 3
 *
 * 힌트
 * 출력설명: {bac}, {acb}, {cba} 3개의 부분문자열이 "abc"문자열과 아나그램입니다.
 */

public class Anagram2 {

    public int solution(String a, String b) {
        int answer = 0;
        HashMap<Character, Integer> hashMapA = new HashMap<>();
        HashMap<Character, Integer> hashMapB = new HashMap<>();
        for (char x : b.toCharArray()) {
            hashMapB.put(x, hashMapB.getOrDefault(x, 0) + 1);
        }
        int bLength = b.length() - 1;
        for (int i = 0; i < bLength; i++) {
            hashMapA.put(a.charAt(i), hashMapA.getOrDefault(a.charAt(i), 0) + 1);
        }

        /**
         * Two pointers Algorithm
         */
        int lt = 0;
        for (int rt = bLength; rt < a.length(); rt++) {
            hashMapA.put(a.charAt(rt), hashMapA.getOrDefault(a.charAt(rt), 0) + 1);
            if (hashMapA.equals(hashMapB)) {
                answer++;
            }
            hashMapA.put(a.charAt(lt), hashMapA.get(a.charAt(lt)) - 1);
            if (hashMapA.get(a.charAt(lt)) == 0) {
                hashMapA.remove(a.charAt(lt));
            }
            lt++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Anagram2 anagram2 = new Anagram2();
        Scanner kb = new Scanner(System.in);
        String s = kb.next();
        String t = kb.next();
        System.out.print(anagram2.solution(s, t));
    }
}
