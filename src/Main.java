import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<String> str =new Stack<>();
        str.push("first");
        str.push("in");
        str.push("last");
        str.push("out");
        str.pop();
        System.out.println(str);
    }
}