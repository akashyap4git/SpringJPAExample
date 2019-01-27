package com.ak4.rest;

import com.ak4.domain.CustomerDO;
import com.ak4.facade.CustomerFacade;
import com.ak4.mapper.CustomerMapper;
import com.ak4.schema.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.core.MediaType;
import java.awt.*;

@RestController
@RequestMapping(name = "/service/myapp")
public class CustomerRestController {

    @Autowired
    private CustomerFacade customerFacade;

    @Autowired
    private CustomerMapper customerMapper;

    @PostMapping(name = "/createCust", produces = {MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON},
            consumes = {MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public Customer createCustomer(@RequestBody Customer customer) {
        CustomerDO customerDO = customerMapper.from(customer);
        return customerFacade.createCustomerAndActivate(customerDO);
    }
}
