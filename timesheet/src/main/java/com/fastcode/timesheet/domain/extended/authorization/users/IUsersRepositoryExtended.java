package com.fastcode.timesheet.domain.extended.authorization.users;

import org.springframework.stereotype.Repository;
import com.fastcode.timesheet.domain.core.authorization.users.IUsersRepository;
import org.javers.spring.annotation.JaversSpringDataAuditable;

@JaversSpringDataAuditable
@Repository("usersRepositoryExtended")
public interface IUsersRepositoryExtended extends IUsersRepository {

	//Add your custom code here
}

