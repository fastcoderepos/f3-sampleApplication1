package com.fastcode.timesheet.domain.extended.authorization.usersrole;

import org.springframework.stereotype.Repository;
import com.fastcode.timesheet.domain.core.authorization.usersrole.IUsersroleRepository;
import org.javers.spring.annotation.JaversSpringDataAuditable;

@JaversSpringDataAuditable
@Repository("usersroleRepositoryExtended")
public interface IUsersroleRepositoryExtended extends IUsersroleRepository {

	//Add your custom code here
}

