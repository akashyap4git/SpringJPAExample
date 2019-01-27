package com.ak4.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class HomeAddressEntity extends AddressEntity {

    @Column(name = "HOME_ADDRESS_LINE")
    private String homeAddressLine;

    public String getHomeAddressLine() {
        return homeAddressLine;
    }

    public void setHomeAddressLine(String homeAddressLine) {
        this.homeAddressLine = homeAddressLine;
    }
}
