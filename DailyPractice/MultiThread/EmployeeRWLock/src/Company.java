import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.stream.Collectors;

public class Company {
    private List<Employee> employee=new ArrayList<>();
    ReentrantReadWriteLock rw=new ReentrantReadWriteLock();
    public void add(Employee e){
        Lock lock=rw.writeLock();
        try{
            lock.lock();
            employee.add(e);
        }catch (Exception er){
            System.out.println(er.getMessage());
        }finally {
            lock.unlock();
        }
    }
    public void getTotalSalary(){
        Lock lock=rw.readLock();
        try{
            lock.lock();
            double total=employee.stream().mapToDouble(Employee::getSalary).reduce(0,Double::sum);
            System.out.println("Total Spent is ->"+total);
        }catch (Exception err){
            System.out.println(err);
        }finally {
            lock.unlock();
        }
    }
    public void getByID(int Id){
        Set<Employee> emp=employee.stream().filter(e->e.getId()==Id).collect(Collectors.toSet());
        System.out.println("Employee is " +emp);
    }
    public void getAll(){
        employee.forEach(System.out::println);
    }
}
