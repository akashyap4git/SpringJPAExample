package com.ak4.entity;

import javax.persistence.*;

import static java.util.UUID.randomUUID;

@Entity
@Table(name = "CUST_VEHICLE")
public class VehicleEntity {

    @Id
    @Column(name = "VEHICLE_ID")
    private String vehicleId = randomUUID().toString();

    @Column(name = "VEHICLE_NAME")
    private String vehicleName;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "CUST_ID")
    private CustomerEntity customerEntity;

    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public CustomerEntity getCustomerEntity() {
        return customerEntity;
    }

    public void setCustomerEntity(CustomerEntity customerEntity) {
        this.customerEntity = customerEntity;
    }
}
