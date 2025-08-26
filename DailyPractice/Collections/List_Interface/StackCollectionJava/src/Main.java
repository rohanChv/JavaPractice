import java.util.Collections;
import java.util.Stack;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Stack<String> stack=new Stack<>();
        stack.push("Hello");
        stack.push("Thing");
        stack.push("Get");
        System.out.println(stack);
        Collections.sort(stack);
        System.out.println(stack);
    }
}