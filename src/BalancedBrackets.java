import java.util.Stack;

public class BalancedBrackets {
   public static boolean isBalancedBracket(String s){
        Stack<Character> inputStack = new Stack<>();
        for(char ch : s.toCharArray()){
            if((ch == '(') || (ch == '{') || (ch == '[')){
                inputStack.push(ch);
            }else{
                if(inputStack == null || inputStack.isEmpty())
                    return  false;
                char top = inputStack.pop();
                if(( ch == ')' && top != '(') || ( ch == ']' && top != '[') || ( ch == '}' && top != '{')){
                    return false;
                }
            }
        }
       return true;
   }

    public static void main(String[] args) {
        String s = "(({})){}";
        System.out.println(isBalancedBracket(s));
    }
}
