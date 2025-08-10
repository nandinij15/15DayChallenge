package Day8;
import java.util.ArrayDeque;
import java.util.Deque;

public class Q394_DecodeString {

    public String decodeString(String s) {
        Deque<Integer> countStack = new ArrayDeque<>();
        Deque<StringBuilder> stringStack = new ArrayDeque<>();
        StringBuilder currentString = new StringBuilder();
        int k = 0;

        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                k = k * 10 + (ch - '0');
            } 
            else if (ch == '[') {
                countStack.push(k);
                stringStack.push(currentString);
                currentString = new StringBuilder();
                k = 0;
            } 
            else if (ch == ']') {
                int count = countStack.pop();
                StringBuilder decoded = stringStack.pop();
                for (int i = 0; i < count; i++) {
                    decoded.append(currentString);
                }
                currentString = decoded;
            } 
            else {
                currentString.append(ch);
            }
        }

        return currentString.toString();
    }
    
}
