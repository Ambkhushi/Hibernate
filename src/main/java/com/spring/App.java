package com.spring;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Project started.." );
        
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        //creating student
        Student st=new Student();
        st.setId(116);
        st.setName("Ayushi");
        st.setCity("Pune");
        System.out.println(st);
        
      Session session=factory.openSession();
      session.beginTransaction();
      session.save(st);
      session.getTransaction().commit();
      session.close();
    }
}
