import java.util.Scanner;

/**
 조합의 경우수(메모이제이션)
 하지만 여러분은 이 공식을 쓰지않고 다음 공식을 사용하여 재귀를 이용해 조합수를 구해주는 프로그램을 작성하세요.

 입력
 첫째 줄에 자연수 n(3<=n<=33)과 r(0<=r<=n)이 입력됩니다.

 출력
 첫째 줄에 조합수를 출력합니다.

 예시 입력 5 3
 예시 출력 10

 예시 입력 33 19
 예시 출력 818809200
 */

public class Memoization {

    int[][] dy = new int[35][35];

    public int DFS(int n, int r) {
        if (dy[n][r] > 0) return dy[n][r];
        if (n == r || r == 0) return 1;
        else return dy[n][r] = DFS(n - 1, r - 1) + DFS(n - 1, r);
    }

    public static void main(String[] args) {
        Memoization memoization = new Memoization();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        System.out.println(memoization.DFS(n, r));
    }
}