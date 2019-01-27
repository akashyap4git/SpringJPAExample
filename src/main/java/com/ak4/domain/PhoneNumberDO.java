package com.ak4.domain;

public class PhoneNumberDO {

    private String phoneId;

    private Long phoneNumber;

    private CustomerDO customerDO;

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

    public CustomerDO getCustomerDO() {
        return customerDO;
    }

    public void setCustomerDO(CustomerDO customerDO) {
        this.customerDO = customerDO;
    }
}
