package com.ak4.domain;

public class VehicleDO {

    private String vehicleId;

    private String vehicleName;

    private CustomerDO customerDO;

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

    public CustomerDO getCustomerDO() {
        return customerDO;
    }

    public void setCustomerDO(CustomerDO customerDO) {
        this.customerDO = customerDO;
    }
}
