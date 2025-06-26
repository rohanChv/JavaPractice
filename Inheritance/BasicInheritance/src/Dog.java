@Voice(age = 12,voice="bark")
public class Dog extends Animal {
    public void response(){
        System.out.println("In response I will ");
    }

    @Override
    public void commonProp() {
        System.out.println("I am dog who can Eat,breathe and sleep");
    }
}
