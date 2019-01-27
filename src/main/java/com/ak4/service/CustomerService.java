package com.ak4.service;

import com.ak4.domain.CustomerDO;

public interface CustomerService {

    public CustomerDO createCustomer(CustomerDO customerDO);

    public boolean deleteCustomer(String customerId);

    public CustomerDO findCustomerById(String customerId);

    public CustomerDO updateCustomer(String customerId);
}
