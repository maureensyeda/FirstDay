package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageobjectModel {
WebDriver driver; 
public PageobjectModel(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	
}
@FindBy(xpath="//input [@id='email']")
private WebElement email;
public WebElement getEmail() {
	return email;
}

@FindBy(xpath="//input [@value='Log In']")
private WebElement login;
public WebElement getLogin() {
 	return login;
}




}
