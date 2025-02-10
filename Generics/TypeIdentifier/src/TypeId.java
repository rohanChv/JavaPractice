public class TypeId {
    public static <T> void printType(T inputVar){
        System.out.println("Input : "+inputVar);
        System.out.println("Type : "+inputVar.getClass().getName());
    }

    public static void main(String[] args) {
        printType("String is Here");
        printType(20);
    }
}
