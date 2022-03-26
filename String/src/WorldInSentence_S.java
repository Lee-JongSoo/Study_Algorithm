import java.util.Scanner;

public class WorldInSentence_S {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String[] s = str.split(" ");

        int n = Integer.MIN_VALUE;
        String answer = "";
        for (String x : s) {
            if (x.length() > n) {
                n = x.length();
                answer = x;
            }else continue;
        }

        System.out.println(answer);
    }
}
