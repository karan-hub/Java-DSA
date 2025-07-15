package Stack_And_Queue;

import java.util.Stack;

public class PalenthesisValid {
    Stack<Character> palenthis = new Stack<>();

    public  boolean  check(String str){
        for (char ch: str.toCharArray()){
            if (ch == '(' || ch == '{' || ch =='[' )
                palenthis.push(ch);
            else
                if (palenthis.isEmpty()) return  false;
                else palenthis.pop();
        }
        return  true;
    }

}
