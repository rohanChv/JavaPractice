import java.util.List;
import java.util.Stack;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Stack<String> stack=new Stack<>();
        stack.push("Hemanth");
        stack.push("Suresh");
        stack.push("Gukesh");
        System.out.println(stack.peek());
        System.out.println(stack.search("Suresh"));// returns 1 based index
    }
}