public class GenDemo{
    public static void main(String[] args) {
        BasicGen<Integer> intgerObject=new BasicGen<>(20);
        BasicGen<String> stringObject=new BasicGen<>("Hello Generic String");
        System.out.println("value : " +intgerObject.getObject());
        intgerObject.showType();
        System.out.println(stringObject.getObject());
        stringObject.showType();
    }
}
