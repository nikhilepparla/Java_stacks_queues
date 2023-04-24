import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(6);
        queue.add(80);
        queue.add(7);
        queue.remove();
        System.out.println(queue);
    }
}