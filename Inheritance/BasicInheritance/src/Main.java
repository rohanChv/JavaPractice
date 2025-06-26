public class Main {
    public static void main(String[] args) {
        Dog reo=new Dog();
        reo.commonProp();
        reo.response();
        Voice reoVoice= reo.getClass().getAnnotation(Voice.class);
        System.out.print(reoVoice.voice());
        System.out.println(reo.name);
    }
}