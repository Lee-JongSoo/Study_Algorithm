import java.util.Scanner;

public class UppercaseLowercase {
    public static void main(String[] args) {
        UppercaseLowercase ul = new UppercaseLowercase();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.print(ul.solution(str));
    }

    public String solution(String str) {
        String answer = "";
        for (char x : str.toCharArray()) {
/*            if (Character.isLowerCase(x)) {
                answer += Character.toUpperCase(x);
            } else {
                answer += Character.toLowerCase(x);
            }*/

            /**
             * 아스키 코드를 활용
             */
            if (x >= 97 && x <= 122) {
                answer += (x-32);
            } else {
                answer += (x+32);
            }
        }

        return answer;
    }
}
