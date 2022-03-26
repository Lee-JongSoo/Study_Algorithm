import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UppercaseLowercase_S {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        String answer = "";

        for (char x : str.toCharArray()) {
            if (Character.isLowerCase(x)) {
                answer += Character.toUpperCase(x);
            } else {
                answer += Character.toLowerCase(x);
            }
        }

        System.out.println(answer);
    }
}
