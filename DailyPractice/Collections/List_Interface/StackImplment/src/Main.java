//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Stack<String> stack=new Stack<>();
        stack.push("Hello");
        stack.push("There");
        stack.push("World");
        System.out.println(stack.getSize());
        stack.pop();
        System.out.println(stack.getSize());
    }
}