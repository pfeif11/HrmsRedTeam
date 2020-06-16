package com.hrms.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;

import com.hrms.utils.CommonMethods;
import com.hrms.utils.ConfigsReader;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddWorkExperienceSteps extends CommonMethods {
	
	@Given("user navigates to Hrms is logged in as Admin")
	public void user_navigates_to_Hrms_is_logged_in_as_Admin() {
	   login.login(ConfigsReader.getProperty("username"), ConfigsReader.getProperty("password"));
	}

	@When("user navigates to employee list")
	public void user_navigates_to_employee_list() {
		jsClick(dashboard.PIM);
	 
	}

	@When("user searches employee by id number {string} and clicks on employee")
	public void user_searches_employee_by_id_number_and_clicks_on_employee(String id) {
	    wait(2);
		sendText(viewEmp.empID, id);
	    jsClick(viewEmp.searchButton);
	    jsClick(viewEmp.empSrcFirstName);
	}

	@When("user clicks on Qualifications tab and clicks on Add button under Work Experience")
	public void user_clicks_on_Qualifications_tab_and_clicks_on_Add_button_under_Work_Experience() {
	 click(pdetails.qualifications);
	 
	}

	@Then("user enters the following details and user clicks save button and sees work experience added to list")
	public void user_enters_the_following_details_and_user_clicks_save_button(DataTable table) {
	  List<Map<String,String>> maps=table.asMaps();
		
	  for(Map<String,String> map:maps) {
		  click(qualifications.addWorkExperienceButton);
		  wait(2);
		  sendText(qualifications.company, map.get("Company"));
		  sendText(qualifications.jobTitle, map.get("JobTitle"));
		  sendText(qualifications.fromDateTextBox, map.get("FromDate"));
		  sendText(qualifications.toDateTextBox, map.get("ToDate"));
		  sendText(qualifications.workExpCommentBox,map.get("Comment"));
		  click(qualifications.workExpSaveButton);
		  Assert.assertTrue(driver.findElement(By.linkText(map.get("Company"))).isDisplayed());
		  
		  
	  }
		
	}

	



}
