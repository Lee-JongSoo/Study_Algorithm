import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * K번째 큰 수(TreeSet)
 * 현수는 1부터 100사이의 자연수가 적힌 N장의 카드를 가지고 있습니다. 같은 숫자의 카드가 여러장 있을 수 있습니다.
 * 현수는 이 중 3장을 뽑아 각 카드에 적힌 수를 합한 값을 기록하려고 합니다. 3장을 뽑을 수 있는 모든 경우를 기록합니다.
 * 기록한 값 중 K번째로 큰 수를 출력하는 프로그램을 작성하세요.
 * 만약 큰 수부터 만들어진 수가 25 25 23 23 22 20 19......이고 K값이 3이라면 K번째 큰 값은 22입니다.
 *
 * 입력
 * 첫 줄에 자연수 N(3<=N<=100)과 K(1<=K<=50) 입력되고, 그 다음 줄에 N개의 카드값이 입력된다.
 *
 * 출력
 * 첫 줄에 K번째 수를 출력합니다. K번째 수가 존재하지 않으면 -1를 출력합니다.
 *
 * 예시 입력 10 3
           13 15 34 23 45 65 33 11 26 42
 * 예시 출력 143
 */

public class TreeSetA {

    public int solution(int[] arr, int n, int k) {
        int answer = -1;
        TreeSet<Integer> treeSet = new TreeSet<>(Collections.reverseOrder());  //default는 오름차순, reverseOrder는 내림차순
        for (int i = 0; i < n-2; i++) {
            for (int j = i + 1; j < n-1; j++) {
                for (int w = j + 1; w < n; w++) {
                    treeSet.add(arr[i] + arr[j] + arr[w]);
                }
            }
        }
        int cnt=0;

        /**
         * TreeSet의 다양한 메서드
         */
        treeSet.remove(143); // 삭제
        System.out.println("TreeSet의 원소의 갯수 : "+treeSet.size()); //원소의 갯수
        System.out.println("처음 값 : " + treeSet.first()); //오름차순 = 최소값, 내림차순 : 최대값 즉, 정렬의 제일 앞의 값
        System.out.println("마지막 값 : " + treeSet.last()); //오름차순 = 최대값, 내림차순 : 최소값 , 정렬의 제일 즉뒤의 값
        for (int x : treeSet) {
            System.out.println(x);
            cnt++;
            if (cnt == k ) return x;
        }

        return answer;
    }

    public static void main(String[] args) {
        TreeSetA treeSetA = new TreeSetA();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int k = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        System.out.print(treeSetA.solution(arr ,n, k));
    }
}
