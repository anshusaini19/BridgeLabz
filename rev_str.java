
import java.util.ArrayDeque;
import java.util.Deque;
public class rev_str {
    public static void main(String[] args) {
        String str="hello";
        Deque<Character> d=new ArrayDeque<>();
        for(char ch: str.toCharArray()) {
            d.push(ch);
        }
        System.out.println(d.peek());
        int count=0;
        StringBuilder sb=new StringBuilder();
        while(!d.isEmpty()){
            sb.append(d.pop());
            
            count++;
        }
        System.out.println(sb);
        System.out.println(count);
        

    }
    //tc: O(n)
    //sc: O(n)

    
}
