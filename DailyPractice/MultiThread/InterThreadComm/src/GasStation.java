import FillerService.Filler;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.stream.Collectors;

public class GasStation {
    private volatile Double capacity=4000.00;
    private volatile boolean isEmpty=false;
    private boolean isFilling=false;
    List<Dispenser> dispenserList=new ArrayList<>();
    Lock lock=new ReentrantLock();
    Condition con=lock.newCondition();
    public GasStation(){
        for(int i=1;i<=10;i++){
            Integer a=i;
            Dispenser d=new Dispenser("BPCL".concat("_Despenser_"+a.toString()),false);
            dispenserList.add(d);
        }
    }
    public void fillUpTank(String driver,double demand) throws InterruptedException {
        int index=0;
        Dispenser d;
        if(capacity<demand){
            isEmpty=true;
            if(!isFilling){
                lock.lock();
                fillUpStationTank();
                lock.unlock();
            }
            else
                synchronized (this){
                    wait();
                }

            System.out.println(driver+" Is Waiting");
        }
        synchronized (this){
        List<Dispenser> availablePump=  dispenserList.stream().filter(e->!e.isOccuped()).collect(Collectors.toList());
        d=availablePump.get(0);
         index=dispenserList.indexOf(d);
            d.setOccuped(true);
            dispenserList.set(index,d);
        }
        System.out.println(driver+" is Filling "+demand+" gallons up on "+d.getName());
            Thread.sleep(10000);
            synchronized (this) {
                capacity-=demand;
                d.setOccuped(false);
                dispenserList.set(index, d);
            }
    }
    public void fillUpStationTank() throws InterruptedException {
        Filler f=new Filler();
        if(!(capacity>4000) && isEmpty){
            isFilling=true;
            System.out.println("Filling");
            Thread.sleep(20000);
            System.out.println("Filled");
            capacity+=f.getGasQunatity();
            synchronized (this){
                notifyAll();
            }

        }
    }
}
