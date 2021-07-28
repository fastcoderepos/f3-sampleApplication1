package com.fastcode.timesheet.domain.extended.customer;

import org.springframework.stereotype.Repository;
import com.fastcode.timesheet.domain.core.customer.ICustomerRepository;
import org.javers.spring.annotation.JaversSpringDataAuditable;

@JaversSpringDataAuditable
@Repository("customerRepositoryExtended")
public interface ICustomerRepositoryExtended extends ICustomerRepository {

	//Add your custom code here
}

