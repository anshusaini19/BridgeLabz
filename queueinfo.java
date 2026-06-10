import java.util.ArrayDeque;

public class queueinfo {
    public static void main(String[] args) {

        ArrayDeque<Integer> q = new ArrayDeque<>();

        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);

        System.out.println("Queue: " + q);
        System.out.println("Size: " + q.size());
        System.out.println("First Element: " + q.peek());
        System.out.println("Last Element: " + q.peekLast());
    }
}