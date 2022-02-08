import java.util.HashMap;
import java.util.Scanner;

/**
 * 학급 회장(해쉬)
 * 학급 회장을 뽑는데 후보로 기호 A, B, C, D, E 후보가 등록을 했습니다.
 * 투표용지에는 반 학생들이 자기가 선택한 후보의 기호(알파벳)가 쓰여져 있으며 선생님은 그 기호를 발표하고 있습니다.
 * 선생님의 발표가 끝난 후 어떤 기호의 후보가 학급 회장이 되었는지 출력하는 프로그램을 작성하세요.
 * 반드시 한 명의 학급회장이 선출되도록 투표결과가 나왔다고 가정합니다.
 *
 * 입력
 * 첫 줄에는 반 학생수 N(5<=N<=50)이 주어집니다.
 *두 번째 줄에 N개의 투표용지에 쓰여져 있던 각 후보의 기호가 선생님이 발표한 순서대로 문자열로 입력됩니다.
 *
 * 출력
 * 학급 회장으로 선택된 기호를 출력합니다.
 *
 * 예시 입력 15
           BACBACCACCBDEDE
 * 예시 출력 C
 */

public class HashMapA {

    public char solution(int n, String s) {
        char answer = ' ';
        HashMap<Character, Integer> map = new HashMap<>();
        for (char x : s.toCharArray()) {
            /**
             * 특정 알파벳을 찾을 때 만약 그 알파벳이 그 이후에 없을 때 0을 리턴하기 때문에,
             * getOrDefault 메서드를 사용해서 default 값인 0을 리턴하고 1을 더해서 하나만 존재 하게 만드는 코드
             */
            map.put(x, map.getOrDefault(x, 0) + 1 );
        }
        System.out.println("HashMap에 key 존재 여부 : " + map.containsKey('A')); //특정 key가 있는지 확인하느 코드 true or false 를 return
        System.out.println("key의 갯수 : " +map.size()); //key의 갯수를 return
        System.out.println("key 삭제 : " + map.remove('A')); //key 삭제 value를 return
        System.out.println("삭제 후 key의 갯수 : " +map.size()); //key의 갯수를 return

        int max = Integer.MIN_VALUE;
        for (char key : map.keySet()) {
            //System.out.println(key + " " + map.get(key)); //조희
            if (map.get(key) > max) {
                max = map.get(key);
                answer = key;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        HashMapA hasMap = new HashMapA();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String str = kb.next();
        System.out.println(hasMap.solution(n, str));
    }

}
