package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;

public class ViewLanguagesPageElements {

	@FindBy(id="btnAdd")
	public WebElement addButton;
	
	public ViewLanguagesPageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}
}
