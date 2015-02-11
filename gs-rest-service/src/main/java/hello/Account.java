package hello;

public class Account {

	public Account(long acct_num , long route_num){
		this.acct_num = acct_num;
		this.route_num = route_num;
	}
	
	public long acct_num;
	public long route_num;
	
	public long getAcct_num(){
		return acct_num;
	}
	public void setAcct_num(int acct_num){
		this.acct_num = acct_num;
	}
	
	public long getRoute_num(){
		return route_num;
	}
	
	public void setRoute_num(long route_num){
		this.route_num = route_num;
	}
	
	//may be need to override toString method
	
}
