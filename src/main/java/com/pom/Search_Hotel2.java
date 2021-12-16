package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Hotel2 {
	
	public static WebDriver driver;
	
	@FindBy(id ="radiobutton_0")
	private WebElement radio1;

	@FindBy(id = "continue")
	private WebElement continue1;

	public Search_Hotel2(WebDriver driver2) {
		this.driver=driver2;
		
		PageFactory.initElements(driver, this);
	}

	public WebElement getRadio1() {
		return radio1;
	}

	public WebElement getContinue1() {
		return continue1;
	}

}
