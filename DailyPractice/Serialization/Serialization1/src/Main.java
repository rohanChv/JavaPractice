import java.io.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Employee ramesh=new Employee("ramesh",2,"Sippi","Pune",300.0);
        File file=new File("Output");
        FileOutputStream fos=new FileOutputStream(file);
        ObjectOutputStream obj=new ObjectOutputStream(fos);
        obj.writeObject(ramesh);
        ObjectInputStream objInput=new ObjectInputStream(new FileInputStream(file));
        Employee emp=new Employee();
        emp=(Employee) objInput.readObject();
        System.out.println(emp.getId());
    }
}