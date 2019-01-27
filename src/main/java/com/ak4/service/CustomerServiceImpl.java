package com.ak4.service;

import com.ak4.domain.CustomerDO;
import com.ak4.entity.CustomerEntity;
import com.ak4.helper.CustomerDOHelper;
import com.ak4.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {
    
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerDOHelper customerDOHelper;

    @Override
    public CustomerDO createCustomer(CustomerDO customerDO) {
        CustomerEntity customerEntity = customerDOHelper.createCustomerEntity(customerDO);
        CustomerEntity createdCustomerEntity = customerRepository.save(customerEntity);
        return customerDOHelper.createCustomerDO(createdCustomerEntity);
    }

    @Override
    public boolean deleteCustomer(String customerId) {
        return false;
    }

    @Override
    public CustomerDO findCustomerById(String customerId) {
        return null;
    }

    @Override
    public CustomerDO updateCustomer(String customerId) {
        return null;
    }
}
