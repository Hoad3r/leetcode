public class IsPalindrome {
    static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int reversed = 0;
        int temp = x;
        while (temp != 0) {
            int digit = temp % 10; // int for catch the right number
            System.out.println(digit);
            reversed = reversed * 10 + digit;
            temp /= 10;
        }
        return (reversed == x);
    }
}
