
class Q1209_remove_all_adjacentDuplicates {
    public String removeDuplicates(String s, int k) {
        Stack<Pair<Character, Integer>> stack = new Stack<>();
        
        for (char c : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek().getKey() == c) {
                stack.peek().setValue(stack.peek().getValue() + 1);
                if (stack.peek().getValue() == k) {
                    stack.pop();
                }
            } else {
                stack.push(new Pair<>(c, 1));
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for (Pair<Character, Integer> p : stack) {
            for (int i = 0; i < p.getValue(); i++) {
                sb.append(p.getKey());
            }
        }
        return sb.toString();
    }
}
