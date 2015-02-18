package hibernate;

import java.util.ArrayList;
import java.util.List;

public class EmailFinding extends CustomEntity {

	
	
	public static void main(String[] args){
	
	EmailFinding af = new EmailFinding();
	af.init();
        // Persist all entities
       // createTransactionalEntityManager();
        System.out.println("Fetching account... " + af.acctFetching(new Long (1)));
       // closeTransactionalEntityManager();
}


  public  List<Customer> acctFetching(long emp_id){
	
	List<Customer> custs = new ArrayList<Customer>();
	
	//long emp_id = 1;
	
	custs = em.createNamedQuery("Customer.findById")
			.setParameter("emp_id", emp_id).getResultList();
	
	for (Customer a : custs){
	
		System.out.println("Acct_num : "+a.getFirst_name());
		System.out.println("Route_num : "+a.getEmail_id());
	}
	
	return custs;
}
}
