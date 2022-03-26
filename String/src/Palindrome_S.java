import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Palindrome_S {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String str = sc.next();
            char[] c = str.toCharArray();
            int lt = 0;
            int rt = str.length() - 1;

            for (int j = 0; j < str.length() / 2; j++) {
                char tmp = c[lt];
                c[lt] = c[rt];
                c[rt] = tmp;
                lt++;
                rt--;
            }

            for (int k = 0; k < c.length; k++) {
                System.out.print(c[k]);
            }
            System.out.println();
        }
    }
}
