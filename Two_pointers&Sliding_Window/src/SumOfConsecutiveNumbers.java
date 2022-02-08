import java.util.Scanner;

/**
 * 연속된 자연수의 합
 * N입력으로 양의 정수 N이 입력되면 2개 이상의 연속된 자연수의 합으로 정수 N을 표현하는 방법의 가짓수를 출력하는 프로그램을 작성하세요.
 * 만약 N=15이면
 * 7+8=15
 * 4+5+6=15
 * 1+2+3+4+5=15
 * 와 같이 총 3가지의 경우가 존재한다.
 *
 * 입력 첫 번째 줄에 양의 정수 N(7<=N<1000)이 주어집니다.
 *
 * 출력 첫 줄에 총 경우수를 출력합니다.
 *
 * 예시 입력 15
 * 예시 출력 3
 */

public class SumOfConsecutiveNumbers {

    public int solution(int num) {
        int answer = 0, sum = 0, lt = 0;
        int m = num / 2 + 1;
        int[] arr = new int[m];
        for (int i = 0; i < m; i++) arr[i] = i + 1;

        /**
         * two points algorithm
         */
        for (int rt = 0; rt < m; rt++) {
            sum += arr[rt];
            if (sum == num) answer++;
            while (sum > num) {
                sum -= arr[lt++];
                if (sum == num) answer++;
            }
        }

        return answer;
        /**
         * 몫과 나머지를 활용한 수학적인 방법
         * int answer = 0, cnt = 1;
         * num--;
         * while (num > 0) {
         *      cnt++;
         *      num -= cnt;
         *      if (num%cnt == 0) answer++;
         * }
         */
    }

    public static void main(String[] args) {
        SumOfConsecutiveNumbers scn = new SumOfConsecutiveNumbers();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        System.out.print(scn.solution(n));
    }
}
