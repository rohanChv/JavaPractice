import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*
        Built-in Functional interfaces
        1.Consumer->takes input and does not return output accept()
        2.Supplier->get () ->no input returns output
        3.Function ->apply()->takes input and then returns desired type to return .
        4.Perdicate ->Reutrns boolean test()
         */
        Consumer<Integer> intConsumer=(a)-> System.out.println("Hello from Consumer"+a);
        intConsumer.accept(5);
        Supplier<String> stringSupplier=()->"Champu";
        stringSupplier.get();
        Function<Integer,String> function=String::valueOf;
        System.out.println(function.apply(5));
        Person p=new Person();
        Predicate<Integer> myPredicate=p::isUnderage;
        System.out.println(myPredicate.test(5));
    }
}