package com.fastcode.timesheet.domain.extended.project;

import org.springframework.stereotype.Repository;
import com.fastcode.timesheet.domain.core.project.IProjectRepository;
import org.javers.spring.annotation.JaversSpringDataAuditable;

@JaversSpringDataAuditable
@Repository("projectRepositoryExtended")
public interface IProjectRepositoryExtended extends IProjectRepository {

	//Add your custom code here
}

