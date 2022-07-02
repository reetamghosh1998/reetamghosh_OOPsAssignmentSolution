package com.reetam.hrdept;

import com.reetam.superdept.SuperDepartment;

public class HrDepartment extends SuperDepartment {
	
	public String departmentName() {
		return("Welcome to Hr Department");
	}
	
	public String getTodaysWork() {
		
		return("Fill Today's worksheet and mark your attendance");
	}
	
	public String getWorkDeadline() {
		
		return("Complete by EOD");
	}
	
	public String doActivity() {
		
		return("Team Launch");
		
	}

}