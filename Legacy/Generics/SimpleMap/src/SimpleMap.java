public class SimpleMap <K,V>{
    K keyObject;
    V valueObject;

    SimpleMap(K keyObject,V valueObject){
        this.keyObject=keyObject;
        this.valueObject=valueObject;
    }
    public void showTypes(){
        System.out.println(keyObject.getClass().getName());
        System.out.println(valueObject.getClass().getName());
    }
    public void showObjects(){
        System.out.println(valueObject);
        System.out.println(keyObject);
    }
}
