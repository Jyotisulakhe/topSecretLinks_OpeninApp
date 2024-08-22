package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InstagramPage {
	
WebDriver driver1;//global variable of webdriver
	
// creating constructor for Webdriver
	public InstagramPage(WebDriver driver1) {
		this.driver1=driver1;
		PageFactory.initElements(driver1, this);
	}

	@FindBy(xpath = "//input[@name='username']") private WebElement username;//using this line able to find element that present onapplication
	@FindBy(xpath = "//input[@name='password']") private WebElement password;//using this line able to find element that present onapplication
	@FindBy(xpath = "//button[@type='submit']") private WebElement btnLogin;//using this line able to find element that present onapplication

	public WebElement getUsername() {// getter method for accessing username, using this element should public
		return username;
	}
	public WebElement getPassword() {// getter method for accessing password, using this element should public
		return password;
	}
	public WebElement getBtnLogin() {// getter method for accessing button element, using this element should public
		return btnLogin;
	}
	
	
	public void loginInstagram() { //method for doing any action while accessing getter method
		username.sendKeys("jyotisulakhe361@gmail.com");//using sendkeys able to enter data on that text field, in this page email is enter
		password.sendKeys("jyoti@insta");//using sendkeys able to enter data on that text field, in this page password is enter
		btnLogin.click();// click method for clicking button
	}

}
