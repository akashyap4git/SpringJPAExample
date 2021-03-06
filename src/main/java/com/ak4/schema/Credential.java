package com.ak4.schema;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Credential {

    private String credId;

    private String username;

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
