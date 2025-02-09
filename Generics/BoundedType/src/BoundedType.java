public class BoundedType <T extends Number>{//Bound Type to Number
    T[] numbers;
    double sum;
    BoundedType(T[] o){
        numbers=o;
    }
    public double getAverage(){
        for(T num:numbers){
            sum+=num.doubleValue();
        }
        System.out.println("Sum : "+sum);
        System.out.println("Average : "+sum/numbers.length);
        return sum/numbers.length;
    }
    public void compareAverage(BoundedType<?> ob){
        if(ob.getAverage()==getAverage()){
            System.out.println("Equal");
        }
        else System.out.println("not Equal");
    }
}
