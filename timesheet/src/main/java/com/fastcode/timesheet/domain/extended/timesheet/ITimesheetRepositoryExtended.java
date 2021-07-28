package com.fastcode.timesheet.domain.extended.timesheet;

import org.springframework.stereotype.Repository;
import com.fastcode.timesheet.domain.core.timesheet.ITimesheetRepository;
import org.javers.spring.annotation.JaversSpringDataAuditable;

@JaversSpringDataAuditable
@Repository("timesheetRepositoryExtended")
public interface ITimesheetRepositoryExtended extends ITimesheetRepository {

	//Add your custom code here
}

