package Day8;

import java.util.*;
class Q71_SimplifyPaths {
    public String simplifyPath(String path) {
        Deque<String> stack = new ArrayDeque<>();
        
        
        String[] parts = path.split("/");
        
        for (String part : parts) {
            if (part.equals("") || part.equals(".")) {
                continue;
            } else if (part.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(part);
            }
        }
        
        if (stack.isEmpty()) {
            return "/";
        }
        
        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.insert(0, "/" + stack.pop());
        }
        
        return result.toString();
    }
}
