package src.com.vehicleservicestation;

import java.util.Objects;

public  class Customer{

	//implements Comparable<Customer>

	private String cname;
	private String mobno;
	private String email;
	private String address;
	
	
	public Customer() {
		super();
	}

	public Customer(String cname, String mobno, String email, String address) {
		//super();
		this.cname = cname;
		this.mobno = mobno;
		this.email = email;
		this.address = address;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getMobno() {
		return mobno;
	}

	public void setMobno(String mobno) {
		this.mobno = mobno;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Customer [cname=" + cname + ", mobno=" + mobno + ", email=" + email + ", address=" + address + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(mobno);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return mobno == other.mobno;
	}

	//@Override
//	public int compareTo(Customer o) {
//		 return Long.compare(this.mobno,o.mobno);
//	}


	
	
}
