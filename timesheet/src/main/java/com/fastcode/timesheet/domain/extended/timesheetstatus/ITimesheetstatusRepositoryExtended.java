package com.fastcode.timesheet.domain.extended.timesheetstatus;

import org.springframework.stereotype.Repository;
import com.fastcode.timesheet.domain.core.timesheetstatus.ITimesheetstatusRepository;
import org.javers.spring.annotation.JaversSpringDataAuditable;

@JaversSpringDataAuditable
@Repository("timesheetstatusRepositoryExtended")
public interface ITimesheetstatusRepositoryExtended extends ITimesheetstatusRepository {

	//Add your custom code here
}

