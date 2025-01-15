package com.customer;

import java.io.Serializable;

public class Customer implements Serializable {
    private static final long serialVersionUID = 1L; 
    private String name;
    private String address;
    private String mobileNumber;

    public Customer(String name, String address, String mobileNumber) {
        this.name = name;
        this.address = address;
        this.mobileNumber = mobileNumber;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    @Override
    public String toString() {
        return "Customer{Name='" + name + "', Address='" + address + "', MobileNumber='" + mobileNumber + "'}";
    }
}
