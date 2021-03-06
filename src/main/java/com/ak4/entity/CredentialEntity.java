package com.ak4.entity;

import javax.persistence.*;

import static java.util.UUID.randomUUID;

@Entity
@Table(name = "CUST_CREDENTIAL")
public class CredentialEntity {

    @Id
    @Column(name = "CRED_ID")
    private String credId = randomUUID().toString();

    @Column(name = "USERNAME")
    private String username;

    @Column(name = "PASSWORD")
    private String password;

    public String getCredId() {
        return credId;
    }

    public void setCredId(String credId) {
        this.credId = credId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
