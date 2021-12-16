package com.sdp;

import org.openqa.selenium.WebDriver;
import com.pom.Book_Hotel1;
import com.pom.Itinerary1;
import com.pom.Login_Page;
import com.pom.Search_Hotel1;
import com.pom.Search_Hotel2;

public class Page_Object_Manager1 {
	
	public WebDriver driver;
	
	private Login_Page lp1;
	private Search_Hotel1 sh1;
	private Search_Hotel2 sh2;
	private Book_Hotel1 bh1;
	private Itinerary1 i1;
	
	public Page_Object_Manager1(WebDriver driver2) {
		this.driver=driver2;
	}
	public Login_Page getInstancelp1() {
		if(lp1==null) {
			lp1 = new Login_Page(driver);
		}
		return lp1;
	}
	public Search_Hotel1 getInstancesh1() {
		if(sh1==null) {
			sh1 = new Search_Hotel1(driver);
		}
		return sh1;
	}
	public Search_Hotel2 getInstancesh2() {
		if(sh2==null) {
			sh2 = new Search_Hotel2(driver);
		}
		return sh2;
	}
	public Book_Hotel1 getInstancebh1() {
		if(bh1==null) {
			bh1 = new Book_Hotel1(driver);
		}
		return bh1;
	}
	public Itinerary1 getInstancei1() {
		if(i1==null) {
			i1 = new Itinerary1(driver);
		}
		return i1;
	}	

}
