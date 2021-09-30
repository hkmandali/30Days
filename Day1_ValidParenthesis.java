import java.util.Stack;

public class Day1_ValidParenthesis {
    public boolean isValid(String s) {
    int len = s.length();
        if(len ==1 )
            return false;
    Stack<Character> st = new Stack<>();
        for(int i=0;i<len;++i)
    {
        char curr = s.charAt(i);
        if(curr == '(' || curr == '{' || curr == '[')
        {
            st.push(curr);
        }
        else
        {
            if(curr == '}')
            {
                if(st.empty() || st.pop() != '{')
                    return false;
            }
            else if(curr == ')')
            {
                if(st.empty() || st.pop() != '(')
                    return false;
            }
            else
            {
                if(st.empty() || st.pop() != '[')
                    return false;
            }
        }
    }
        if(!st.isEmpty())
                return false;
        return true;
}
}
