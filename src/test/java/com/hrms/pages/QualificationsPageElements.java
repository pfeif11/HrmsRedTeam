package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;

public class QualificationsPageElements {

	@FindBy (id="addWorkExperience")
	public WebElement addWorkExperienceButton;
	
	@FindBy (id="experience_employer")
	public WebElement company;
	
	@FindBy (id="experience_jobtitle")
	public WebElement jobTitle;
	
	@FindBy (xpath="//input[@id='experience_from_date']/following-sibling::img")
	public WebElement fromCalendar;
	
	@FindBy (id="experience_from_date")
	public WebElement fromDateTextBox;
	
	@FindBy (id="experience_to_date")
	public WebElement toDateTextBox;
	
	@FindBy (xpath="//input[@id='experience_to_date']/following-sibling::img")
	public WebElement toCalendar;
	
	@FindBy (id="experience_comments")
	public WebElement workExpCommentBox;
	
	@FindBy (id="btnWorkExpSave")
	public WebElement workExpSaveButton;
	
	@FindBy (xpath="//select[@class='ui-datepicker-month']")
	public WebElement monthDD;
	
	@FindBy (xpath="//select[@class='ui-datepicker-year']")
	public WebElement yearDD;
	
	
	
	
	
	
	
	
	
	
	public QualificationsPageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}

}
