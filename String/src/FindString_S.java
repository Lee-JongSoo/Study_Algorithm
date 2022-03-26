import java.util.Scanner;

public class FindString_S {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        String str2 = sc.next();
        char c = str2.toLowerCase().charAt(0);

        int count =0;
        for (char x : str.toLowerCase().toCharArray()) {
            if (x == c) {
                count++;
            }
        }
        System.out.println(count);
    }
}
