package com.ak4.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class WorkAddressEntity extends AddressEntity {

    @Column(name = "WORK_ADDRESS_LINE")
    private String workAddressLine;

    public String getWorkAddressLine() {
        return workAddressLine;
    }

    public void setWorkAddressLine(String workAddressLine) {
        this.workAddressLine = workAddressLine;
    }
}
