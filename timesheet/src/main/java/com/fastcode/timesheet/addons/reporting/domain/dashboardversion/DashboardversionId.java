package com.fastcode.timesheet.addons.reporting.domain.dashboardversion;

import java.io.Serializable;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.*;

@Getter @Setter
@NoArgsConstructor
public class DashboardversionId implements Serializable {

	private static final long serialVersionUID = 1L;
	
    private Long dashboardId;
  	private Long userId; 
    private String dashboardVersion;
   
    public DashboardversionId(Long userId , Long dashboardId,  String dashboardVersion) {
		super();
		this.dashboardId = dashboardId;
	    this.userId = userId;
		this.dashboardVersion = dashboardVersion;
	}
    
}

