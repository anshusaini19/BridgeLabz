import java.util.*;
public class bal_parentheses {
    public static void main(String[] args) {
        String str="(())";
        Deque<Character> dq=new ArrayDeque<>();
        boolean balanced=true;
        for(char ch:str.toCharArray()){
            if(ch=='('){
                dq.push(ch);

            }else if(ch==')'){
                if(dq.isEmpty()){
                    balanced=false;
                    break;
                }
                dq.pop();
            }
        }
        if(!dq.isEmpty()){
            balanced=false;
        }
        System.out.println(balanced? "balanced":"not balanced");
        
    }

    
}
