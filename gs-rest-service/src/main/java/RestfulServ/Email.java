package RestfulServ;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jack.obj.EmailId;

@RestController
public class Email {

	 @RequestMapping("/email")
	   public EmailId email(@RequestParam(value="emp_id", defaultValue= "2" ) long emp_num){
	
		return new EmailId("howards_s@yahoo.com"); 
	 }
	
}
