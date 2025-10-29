import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.locks.ReentrantLock;

public class Bank {
    private List<Account> accounts=new ArrayList<>();
    Bank(){
        for(int i=0;i<10;i++){
            accounts.add(new Account(100));
        }
    }
    public int totalBalance(){
        int sum=0;
        for(Account a:accounts){
            sum+=a.getBalance();
        }
        return sum;
    }
    public void getAccountDetails(){
        for(Account a:accounts){
            System.out.println(a.getBalance());
        }
    }
    public void startTransactions()  {
        try{
            for(int i=0;i<10;i++){

                    Account fromAccount=accounts.get(i);
                    Account toAccount=accounts.get(9-i);
                    fromAccount.withdraw(10);
                    Thread t=Thread.currentThread();
                    //Thread.sleep(10);
                    toAccount.Deposit(10);
                    System.out.println("Executed by "+t.getName()+" Total AUM is "+totalBalance());
            }
        }catch (Exception e){
        System.out.println(e.getMessage());
        }
    }
}
