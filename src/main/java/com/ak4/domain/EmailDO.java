package com.ak4.domain;

public class EmailDO {

    private String id;

    private String emailId;

    private CustomerDO customerDO;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public CustomerDO getCustomerDO() {
        return customerDO;
    }

    public void setCustomerDO(CustomerDO customerDO) {
        this.customerDO = customerDO;
    }


}
