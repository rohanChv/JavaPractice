public class GenericClass <T extends Number>{

    public <T extends Number> double add(T val[]){
        double sum=0.0;
        for(int i=0;i< val.length;i++){
           sum+=val[i].doubleValue();
        }
        return sum;
    }
    public boolean compareAverage(T integerValue,T doubleValue){
        if (integerValue.doubleValue()==doubleValue.doubleValue()){
            return true;
        }
        return false;
    }
}
