package org.pom;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductSelect extends BaseClass {
	
	

	public ProductSelect() {
		
PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='chrome-search']")
	private WebElement search;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement click;
	
	@FindBy (xpath="//select[@id='main-size-select-0']")
	private WebElement select;
	
	@FindBy (xpath="//span[text()='Add to bag']")
	private WebElement Addtocard;
    
	@FindBy (xpath="//div[text()='Sorry, there was an issue adding this item to the bag, please try again.']")
	private WebElement text;
	

	public WebElement getText() {
		return text;
	}

	public WebElement getAddtocard() {
	return Addtocard;
}

	public WebElement getSearch() {
		return search;
	}

	public WebElement getClick() {
		return click;
	}

	public WebElement getSelect() {
		return select;
	}
	

	
}
