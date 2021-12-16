package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Itinerary1 {
	
	public static WebDriver driver;
	
	@FindBy(id = "my_itinerary")
	private WebElement iter;

	public Itinerary1(WebDriver driver2) {
		this.driver=driver2;
		
		PageFactory.initElements(driver, this);
	}

	public WebElement getIter() {
		return iter;
	}
	
	
}
