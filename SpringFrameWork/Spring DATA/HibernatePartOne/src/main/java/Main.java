import model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import util.HibernateUtils;

public class Main {
    public static void main(String[] args) {
        SessionFactory sf= HibernateUtils.getSessionFactory();
        Session s=sf.openSession();
        s.beginTransaction();
        User u=new User("TEST","TEST!@","@gamil","INDIA");
        s.save(u);
        s.getTransaction().commit();
        s.close();
        System.out.println("DONE");

    }
}
