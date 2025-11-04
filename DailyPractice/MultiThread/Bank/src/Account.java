import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Account {
    int balance;
    Account(int amount){
        this.balance=amount;
    }
    public void withdraw(int amount){
        Lock lock=new ReentrantLock();
        lock.lock();
        try{
            this.balance-=amount;
            System.out.println("Withdrawed "+amount);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        lock.unlock();
    }
    public void Deposit(int amount){
        Lock lock=new ReentrantLock();
        lock.lock();
        try{
            this.balance+=amount;
            System.out.println("Deposit "+amount);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        lock.unlock();
    }
    public  int getBalance(){
        return balance;
    }
}
