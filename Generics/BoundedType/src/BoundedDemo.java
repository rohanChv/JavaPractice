public class BoundedDemo {
    public static void main(String[] args) {
        Integer[] intArrays={1,2,3,4};
        Double[] doubleArr={1.1,2.2,3.3,4.4};
        BoundedType<Integer>intArray=new BoundedType<>(intArrays);
        BoundedType<Double>doubleArray=new BoundedType<>(doubleArr);
        intArray.getAverage();
        doubleArray.getAverage();
    }
}
