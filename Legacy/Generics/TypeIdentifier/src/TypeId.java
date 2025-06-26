public class TypeId {
    public static <T> void printType(T inputVar){
        System.out.println("Input : "+inputVar);
        System.out.println("Type : "+inputVar.getClass().getSimpleName());
    }

    public static void main(String[] args) {
        printType("String is Here");
        printType(20);
    }
}
