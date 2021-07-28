package com.fastcode.timesheet.domain.extended.task;

import org.springframework.stereotype.Repository;
import com.fastcode.timesheet.domain.core.task.ITaskRepository;
import org.javers.spring.annotation.JaversSpringDataAuditable;

@JaversSpringDataAuditable
@Repository("taskRepositoryExtended")
public interface ITaskRepositoryExtended extends ITaskRepository {

	//Add your custom code here
}

