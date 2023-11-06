package com.anudip1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.anudip1.model.Address;
import com.anudip1.model.Customer;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory=cfg.buildSessionFactory();
        Session session =factory.openSession();
        try
        {
        	Address a1=new Address();
        	 a1.setCity("knr");
          	Customer s1=new Customer();
       	    s1.setName("manu");
       	    s1.setAddress(a1);
       	    
       	  
      	   Customer s2=new Customer();
   	       s2.setName("mouni");
   	       s2.setAddress(a1);
       	 
       	 session.beginTransaction();
       	session.save(a1);
       	 session.save(s1);
       	session.save(s2);
       	 session.getTransaction().commit();
       	 
       	
        }
        catch(Exception e)
        {
       	 e.printStackTrace();
        }
        finally
        {
       	 session.close();
       	 factory.close();
        }
        
        

    }
}
