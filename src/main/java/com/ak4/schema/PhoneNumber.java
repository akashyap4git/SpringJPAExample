package com.ak4.schema;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class PhoneNumber {

    private String phoneId;

    private Long phoneNumber;

    private Customer customer;

    public String getPhoneId() {
        return phoneId;
    }

    public void setPhoneId(String phoneId) {
        this.phoneId = phoneId;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
