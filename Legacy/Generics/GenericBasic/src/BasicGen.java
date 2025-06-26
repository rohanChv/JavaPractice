public class BasicGen <T>{
    T object;
    BasicGen(T o){
        object=o;
    }
    T getObject(){
        return object;
    }
    void showType(){
        System.out.println(object.getClass().getName());
    }
}
