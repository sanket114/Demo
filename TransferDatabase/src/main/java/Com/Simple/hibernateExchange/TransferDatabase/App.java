package Com.Simple.hibernateExchange.TransferDatabase;



import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
	static List<Employe> l=new ArrayList<Employe>();
	
	
	static Configuration cf=new Configuration();
	static SessionFactory sf=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	static SessionFactory sforacle=new Configuration().configure("hibernate1.cfg.xml").buildSessionFactory();

	static Employe e1=new Employe(123, "SAnket", 1234123, 12);
	static Employe e2=new Employe(124, "SAnket", 1234123, 12);
	static Employe e3=new Employe(125, "SAnket", 1234123, 12);
	static Employe e4=new Employe(126, "SAnket", 1234123, 12);
	static Session s;
	//static String query="select * from Employe12";
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
       insert();
       l= getInfo();
       saveInOracle();
    }
    private static void saveInOracle() {
    	Session s1=sforacle.openSession();
        Transaction t= s1.beginTransaction();
        Iterator<Employe> itr=l.iterator();
        while (itr.hasNext()) {
			Employe employe = (Employe) itr.next();
			s1.save(employe);
			
		}
       
        s1.flush();
        t.commit();
        //le.add(s);
        
    	
	}
	public static List<Employe> getInfo() {
    	System.out.println("dtata fire");
    	List<Employe> le=(List<Employe>) s.createQuery("from Employe").list();
    	Iterator<Employe> itr=le.iterator();
    	while (itr.hasNext()) {
			Employe employe = itr.next();
			System.out.println("Add in list"+employe);
			l.add(employe);
			
			
		}
		return l;
		
	}
	public static void insert() {
    	  s=sf.openSession();
         Transaction t= s.beginTransaction();
        
         s.save(e1);
         s.save(e2);
         s.save(e3);
         s.save(e4);
         //le.add(s);
         s.flush();
         t.commit();
        // s.close();
		
    	
    }
    
}
