import java.util.ArrayDeque;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayDeque<String> array=new ArrayDeque<>();
        array.add("Hello");
        array.addFirst("First");
        array.addLast("Last");
        array.offer("OfferLast");
        array.offerFirst("OfferFirst");
        array.offerLast("Explicit Last");
        System.out.println(array);
        // Removal
        array.remove();//remove from begining
        array.removeFirst();//remove from First
        array.removeLast();
        System.out.println(array);
        System.out.println("removing ->"+array.poll());
        //pollFirst poll Last
        System.out.println("Access");
        System.out.println(array.peek());


    }
}