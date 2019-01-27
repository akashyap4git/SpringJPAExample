package com.ak4.facade;

import com.ak4.domain.CustomerDO;
import com.ak4.mapper.CustomerMapper;
import com.ak4.schema.Customer;
import com.ak4.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CustomerFacade {

    @Autowired
    private CustomerService customerService;

    @Autowired
    private CustomerMapper customerMapper;

    public Customer createCustomerAndActivate(CustomerDO customerDO) {
        CustomerDO createdCustomerDO = customerService.createCustomer(customerDO);
        return customerMapper.from(createdCustomerDO);
    }
}
