public class GenricMethod {
    public static <T> void printArray(T[] inputArray){
        for(T element:inputArray){
            System.out.println(element);
        }

    };
    public static void main(String[] args) {
        Integer[] firstArray={1,2,3};
        String[] secondArray={"Hello","World"};
        printArray(firstArray);
        printArray(secondArray);
    }
}
