package hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CustomEntity {

	 public  void init(){
	    	emf = Persistence.createEntityManagerFactory("com.howard.api.jpa");
			 em = emf.createEntityManager();
	    }
	
	 protected static EntityManagerFactory emf;
	 protected static EntityManager em;
}
