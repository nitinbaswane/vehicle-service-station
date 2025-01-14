package com.vehiclestation;

public  class Customer implements Comparable<Customer> {

	public int compareTo(String anotherString) {
		return address.compareTo(anotherString);
	}

	private String cname;
	private int mobno;
	private String email;
	private String address;
	
	public Customer(String cname, int mobno, String email, String address) {
		super();
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

	public long getMobno() {
		return mobno;
	}

	public void setMobno(int mobno) {
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
	public int compareTo(Customer o) {
		 return Integer.compare(this.mobno,o.mobno);
	}


	
	
}
