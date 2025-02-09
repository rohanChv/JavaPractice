public class BoundedType <T extends Number>{//Bound Type to Number
    T[] numbers;
    double sum;
    BoundedType(T[] o){
        numbers=o;
    }
    public void getAverage(){
        for(T num:numbers){
            sum+=num.doubleValue();
        }
        System.out.println("Sum : "+sum);
        System.out.println("Average : "+sum/numbers.length);
    }
}
