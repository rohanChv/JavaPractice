public class BoundedDemo {
    public static void main(String[] args) {
        Integer[] intArrays={1,2,3,4};
        Double[] doubleArr={1.0,2.0,3.0,4.0};
        BoundedType<Integer>intArray=new BoundedType<>(intArrays);
        BoundedType<Double>doubleArray=new BoundedType<>(doubleArr);
        intArray.getAverage();
        doubleArray.getAverage();
        intArray.compareAverage(doubleArray);
    }
}
