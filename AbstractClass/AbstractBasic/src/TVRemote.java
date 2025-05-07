public class TVRemote extends remoteControl{
    @Override
    void turnOn() {
        System.out.println("Turned On");
    }

    @Override
    void turnOff() {
        System.out.println("turned off");
    }
    void sayHello(){
        System.out.println("Hello");
    }
}
