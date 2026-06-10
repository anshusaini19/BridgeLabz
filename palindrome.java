import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class palindrome {
    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(2);
        q.add(1);

        Stack<Integer> st = new Stack<>();

        // Copy queue elements into stack
        for (int num : q) {
            st.push(num);
        }

        boolean palindrome = true;

        // Compare queue elements with stack elements
        for (int num : q) {
            if (num != st.pop()) {
                palindrome = false;
                break;
            }
        }

        if (palindrome) {
            System.out.println("Queue is Palindrome");
        } else {
            System.out.println("Queue is Not Palindrome");
        }
    }
}