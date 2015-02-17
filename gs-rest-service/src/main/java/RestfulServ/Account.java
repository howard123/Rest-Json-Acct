package RestfulServ;


import hibernate.AccountFinding;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class Account {
	
	
	   @RequestMapping("/account")
	   public com.jack.obj.Account account(@RequestParam(value="emp_id", defaultValue= "2" ) long emp_num){
	    	
	    	//Query database for the account number and routing number
	    	//long emp_num = 1;
	    	
	    	List<com.jack.obj.Account> acts = new ArrayList<com.jack.obj.Account>();
	    	
	    	
	    	AccountFinding af = new AccountFinding();
	    	af.init();
	    	List<hibernate.Account> accts = af.acctFetching(emp_num);
	    	
	    	for (hibernate.Account b : accts ){
	    		
	    		acts.add(new com.jack.obj.Account(b.getAcct_num(),b.getRoute_num()));
	        	
	    	}
	    	
	    	return acts.get(0);
	    }
	
	
}
