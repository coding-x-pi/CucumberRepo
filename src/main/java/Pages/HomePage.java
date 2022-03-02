package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

	@FindBy(xpath = "//div[@class='title']")
	public WebElement title;
	
//	@findBy()
	
	public String matchesForYou() {
		
		return title.getText();
	}
	
	
	
}
