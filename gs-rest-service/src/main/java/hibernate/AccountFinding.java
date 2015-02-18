package hibernate;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AccountFinding extends CustomEntity {

	
    
//	public static void main(String[] args){
//		
//		AccountFinding af = new AccountFinding();
//		af.init();
//	        // Persist all entities
//	       // createTransactionalEntityManager();
//	        System.out.println("Fetching account... " + af.acctFetching(new Long (1)));
//	       // closeTransactionalEntityManager();
//	}
	
	
      public  List<Account> acctFetching(long emp_id){
		
		List<Account> accts = new ArrayList<Account>();
		
		//long emp_id = 1;
		
		accts = em.createNamedQuery("Account.findByAcct_num")
				.setParameter("emp_id", emp_id).getResultList();
		
		for (Account a : accts){
		
			System.out.println("Acct_num : "+a.getAcct_num());
			System.out.println("Route_num : "+a.getRoute_num());
		}
		
		return accts;
	}
      
      
      public static String testFetching(){
  		
  		List<Account> accts = new ArrayList<Account>();
  		
  		long emp_id = 1;
  		
  		accts = em.createNamedQuery("Account.findByAcct_num")
  				.setParameter("emp_id", emp_id).getResultList();
  		
  		for (Account a : accts){
  		
  			System.out.println("Acct_num : "+a.getAcct_num());
  			System.out.println("Route_num : "+a.getRoute_num());
  		}
  		
  		return "Success";
  	}
}
