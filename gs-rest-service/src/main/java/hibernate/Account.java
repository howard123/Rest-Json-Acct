package hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="account")
@NamedQuery(name = "Account.findByAcct_num", query = "select u from Account u where u.emp_id = :emp_id")
public class Account {

	@Id
	private long acct_num;
	
	public long getAcct_num() {
		return acct_num;
	}

	public void setAcct_num(long acct_num) {
		this.acct_num = acct_num;
	}

	public long getRoute_num() {
		return route_num;
	}

	public void setRoute_num(long route_num) {
		this.route_num = route_num;
	}

	@Column 
	private long route_num;
	
	@Column
	private long emp_id;

	public long getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(long emp_id) {
		this.emp_id = emp_id;
	}
	
	@Column
	private long acct_type;

	public long getAcct_type() {
		return acct_type;
	}

	public void setAcct_type(long acct_type) {
		this.acct_type = acct_type;
	}
	
}
