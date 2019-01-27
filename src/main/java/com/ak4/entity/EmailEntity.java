package com.ak4.entity;

import javax.persistence.*;

import static java.util.UUID.randomUUID;

@Entity
@Table(name = "CUST_EMAIL")
public class EmailEntity {

    @Id
    @Column(name = "IDENTIFIER")
    private String id = randomUUID().toString();

    @Column(name = "EMAIL_ID")
    private String emailId;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "CUST_ID")
    private CustomerEntity customerEntity;

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

    public CustomerEntity getCustomerEntity() {
        return customerEntity;
    }

    public void setCustomerEntity(CustomerEntity customerEntity) {
        this.customerEntity = customerEntity;
    }
}
