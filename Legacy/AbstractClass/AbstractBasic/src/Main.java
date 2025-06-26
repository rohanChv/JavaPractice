public class Main {
    public static void main(String[] args) {

        //Abstract Method accessed by Upcasting
        remoteControl remote=new TVRemote();
        //Cannot Access Say Hello remote.sayHello();
        remote.turnOff();
        remote.turnOn();
    }
}