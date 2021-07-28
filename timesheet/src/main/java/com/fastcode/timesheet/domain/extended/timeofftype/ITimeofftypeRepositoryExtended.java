package com.fastcode.timesheet.domain.extended.timeofftype;

import org.springframework.stereotype.Repository;
import com.fastcode.timesheet.domain.core.timeofftype.ITimeofftypeRepository;
import org.javers.spring.annotation.JaversSpringDataAuditable;

@JaversSpringDataAuditable
@Repository("timeofftypeRepositoryExtended")
public interface ITimeofftypeRepositoryExtended extends ITimeofftypeRepository {

	//Add your custom code here
}

