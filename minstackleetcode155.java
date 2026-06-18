import java.util.*;
class minstackleetcode155 {
    Stack<Integer> st;
    Stack<Integer> minst;
    public minstackleetcode155() {
        st=new Stack<>(); 
        minst=new Stack<>();
    }
    
    public void push(int value) {
        st.push(value);
        if(minst.isEmpty() || value<=minst.peek()){
            minst.push(value);
        }
        
    }
    
    public void pop() {
        if(st.peek().equals(minst.peek())){
            minst.pop();
        }
        st.pop();
        
    }
    
    public int top() {
        return st.peek();
        
    }
    
    public int getMin() {
        return minst.peek();
        
        
    }
    public static void main(String[] args) {
        minstackleetcode155 obj = new minstackleetcode155();

        obj.push(-2);
        obj.push(0);
        obj.push(-3);

        System.out.println(obj.getMin()); // -3

        obj.pop();

        System.out.println(obj.top());    // 0
        System.out.println(obj.getMin()); // -2
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */