public class Main {
    public static void main(String[] args) {
        Integer[] intArray ={1,2,3,4,5,5,5};
        Double[] doubleArray ={1.0,2.0,3.0,4.0,5.0,5.0,5.0};

        GenericClass<Integer> intCalc=new GenericClass<>();
        double first=intCalc.add(intArray);
        GenericClass<Double> doubleCalc=new GenericClass<>();
        double second=doubleCalc.add(doubleArray);
        System.out.println(doubleCalc.compareAverage(first,second));
    }
}