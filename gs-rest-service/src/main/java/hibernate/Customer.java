package hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="customer")
@NamedQuery(name = "Customer.findById", query = "select u from Customer u where u.id = :cust_id")
public class Customer {
	
	@Id
    private long id;
	
	@Column
	private String first_name;
	
	@Column
	private String last_name;
	
	@Column
	private String email_address;
	
	
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getEmail_address() {
		return email_address;
	}

	public void setEmail_address(String email_id) {
		this.email_address = email_id;
	}

	
	
	

}
