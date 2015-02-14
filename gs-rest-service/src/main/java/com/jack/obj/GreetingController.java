package com.jack.obj;


import hibernate.AccountFinding;
import hibernate.Account;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(counter.incrementAndGet(),
                            String.format(template, name));
    }
    
//    @RequestMapping("/account")
//    public hello.Account account(@RequestParam(value="emp_id", defaultValue= "2" ) long emp_num){
//    	
//    	//Query database for the account number and routing number
//    	//long emp_num = 1;
//    	
//    	List<hello.Account> acts = new ArrayList<hello.Account>();
//    	
//    	
//    	AccountFinding af = new AccountFinding();
//    	af.init();
//    	List<Account> accts = af.acctFetching(emp_num);
//    	
//    	for (Account b : accts ){
//    		
//    		acts.add(new hello.Account(b.getAcct_num(),b.getRoute_num()));
//        	
//    	}
//    	
//    	return acts.get(0);
//    }
}