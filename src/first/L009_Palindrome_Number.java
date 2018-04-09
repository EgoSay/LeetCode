package first;

import java.util.Scanner;

/**
 * @author codeAC
 * @date 2018/4/9 19:13
 */
public class L009_Palindrome_Number {
    public boolean isPalindrome(int x) {

        if (x < 0) {
            return false;
        }

        if (x >= 0 && x < 10) {
            return true;
        }

        int d = 1;
        while (x / d >= 10) {
            d *= 10;
        }

        while (x != 0) {

            if (x % 10 != x / d) {
                return false;
            }

            x = x % d / 10;
            d /= 100;
        }

        return true;
    }

//    public static void main(String[] args) {
//        L009_Palindrome_Number test = new L009_Palindrome_Number();
//        Scanner sc =  new Scanner(System.in);
//        int x = sc.nextInt();
//        System.out.println(test.isPalindrome(x));
//    }
}
