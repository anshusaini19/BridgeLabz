
import java.util.ArrayDeque;
import java.util.Deque;
public class stack_op {
    public static void main(String[] args) {
        Deque<Integer> d=new ArrayDeque<>();
        d.push(10);
        d.push(20);
        d.push(30);
        System.out.println(d.pop());
        System.out.println(d.isEmpty());
    }

    
}
