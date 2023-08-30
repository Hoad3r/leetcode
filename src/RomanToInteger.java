import java.util.HashMap;
public class RomanToInteger {
    static int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int resultado=0;
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        for (int i = 0; i < s.length(); i++) {
            // Checking that current element is not smaller then previous
            if (i > 0 && map.get(s.charAt(i)) > map.get(s.charAt(i - 1))) {
                // multiplier per 2 because the previous number is in result
                resultado += map.get(s.charAt(i)) - 2 * map.get(s.charAt(i - 1));
            }
            else {
                resultado += map.get(s.charAt(i)); // just sum right away
            }
        }
        return resultado;
    }
}
