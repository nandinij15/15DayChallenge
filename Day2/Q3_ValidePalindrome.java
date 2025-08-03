package Day2;

public class Q3_ValidePalindrome {
     public boolean isPalindrome(String s) {
        char[] specialChars = { ' ', ',', '.', ':', ';', '!', '?', '\'', '\"', '-', '_', '(', ')', '[', ']', '{', '}', '/', '\\', '@', '#', '$', '%', '^', '&', '*', '+', '=', '<', '>', '`', '~' };
        String str = s.toLowerCase();
        for (char ch : specialChars) {
            str = str.replace(String.valueOf(ch), "");
        }
        int st = 0;
        int e = str.length() - 1;
        while (st < e) {
            if (str.charAt(st) != str.charAt(e)) {
                return false;
            }
            st++;
            e--;
        }
        return true;
    }
}
