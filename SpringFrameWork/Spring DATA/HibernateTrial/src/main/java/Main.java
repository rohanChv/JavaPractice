import Utils.HibernateUtils;
import model.HibernateTrial;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Main {
    public static void main(String[] args) {
        SessionFactory sf=HibernateUtils.getSessionFactory();
        Session s=sf.openSession();
        s.beginTransaction();
        HibernateTrial h=new HibernateTrial("Connection_Trial");
        s.save(h);
        s.getTransaction().commit();
        System.out.println("DONE");
    }
}
