public class FirstUnique {
    static int firstUniqChar(String s) {
        int[] freq = new int[26];
        char[] chars = s.toCharArray();

        for (char c : chars) {
            freq[c - 'a']++; // increment the value of frequency of the letter
        }
        // found the element with frequency 1
        for (int i = 0; i < chars.length; i++) {
            if (freq[chars[i] - 'a'] == 1) {
                // using chars[i] for locate the element in array
                return i;
            }
        }
        return -1;
    }
}
