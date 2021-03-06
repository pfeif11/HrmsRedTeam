package com.hrms.testbase;

import com.hrms.pages.AddEmployeePageElements;
import com.hrms.pages.DashboardPageElements;
import com.hrms.pages.DefineReportPageElements;
import com.hrms.pages.EmployeeReportsPageElements;
import com.hrms.pages.LoginPageElements;
import com.hrms.pages.PersonalDetailsPageElements;
import com.hrms.pages.QualificationsPageElements;
import com.hrms.pages.ViewEmployeeListPageElements;


//initializes all pages class and stores references in static varibales
//that will called/used in test classes
public class PageInitializer extends BaseClass{

	public static LoginPageElements login;
	public static AddEmployeePageElements addEmp;
	public static DashboardPageElements dashboard;
	public static PersonalDetailsPageElements pdetails;
	public static DefineReportPageElements defineReport;
	public static EmployeeReportsPageElements empReports;
	public static ViewEmployeeListPageElements viewEmp;
	public static QualificationsPageElements qualifications;
	
	public static void initialize() {
		
		login=new LoginPageElements();
		dashboard=new DashboardPageElements();
		addEmp=new AddEmployeePageElements();
		pdetails=new PersonalDetailsPageElements();
		defineReport=new DefineReportPageElements();
		empReports=new EmployeeReportsPageElements();
		viewEmp=new ViewEmployeeListPageElements();
		qualifications=new QualificationsPageElements();
	}
}