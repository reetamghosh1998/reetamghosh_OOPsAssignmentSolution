package com.reetam.main;

import com.reetam.admindept.AdminDepartment;
import com.reetam.hrdept.HrDepartment;
import com.reetam.techdept.TechDepartment;

public class Main {

	public static void main(String args[]) {
		
		AdminDepartment admn=new AdminDepartment();
		HrDepartment hr=new HrDepartment();
		TechDepartment tch=new TechDepartment();
		
		System.out.println(admn.departmentName());
		System.out.println(admn.getTodaysWork());
		System.out.println(admn.getWorkDeadline());
		System.out.println(admn.isTodayAHoliday());
		System.out.println();
		System.out.println(hr.departmentName());
		System.out.println(hr.doActivity());
		System.out.println(hr.getTodaysWork());
		System.out.println(hr.getWorkDeadline());
		System.out.println(hr.isTodayAHoliday());
		System.out.println();
		System.out.println(tch.departmentName());
		System.out.println(tch.getTodaysWork());
		System.out.println(tch.getWorkDeadline());
		System.out.println(tch.getTechStackInformation());
		System.out.println(tch.isTodayAHoliday());
	}
	
}