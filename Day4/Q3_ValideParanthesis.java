package Day4;

public class Q3_ValideParanthesis {
    public boolean isValid(String s) {
        char stack[] = new char[s.length()];
        int top = -1;
        if(stack.length %2 !=0){
            return false;
        }
        for(char c: s.toCharArray()){
            if(c=='('||
            c=='['||
            c=='{'){
                top = top + 1;
                stack[top] = c;
            }else{
                if(top == -1){
                    return false;
                }
                char last = stack[top];
                if(c==')' && last == '('||
                c==']'&& last == '['||
                c=='}'&& last== '{'){
                    top = top - 1;
                }else{
                    return false;
                }
            }
        }
        return top == -1;
    }
}
