public class LongestCommonPrefix {
    static String longestCommonPrefix(String[] strs) {
        String prefix = strs[0]; // catch the first string
        if(strs.length==0) return ""; // cut the chances of error
        for (int i = 1 ; i < strs.length; i++){
            // loop for compare the strings with the "indexOf"
            while(strs[i].indexOf(prefix)!=0)  {
                // while doesn't have the same letters reduce the prefix to find the "common prefix"
                prefix= prefix.substring(0,prefix.length()-1);
            }
        }
        return prefix;
    }
}
