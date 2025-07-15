package Stack_And_Queue;

import java.util.Stack;

public class MakeValidePalenthesis {
    Stack<Character> palenthis = new Stack<>();

    public  int  check(String str){
        for (char ch: str.toCharArray()){
            if (ch == '(' || ch == '{' || ch =='[' )
                palenthis.push(ch);
            else
            if (palenthis.isEmpty()) return  0;
            else palenthis.pop();
        }
        return  palenthis.size();
    }
}
