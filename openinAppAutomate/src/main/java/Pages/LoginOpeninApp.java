package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class LoginOpeninApp {

	WebDriver driver; //creating global variable of webdriver
	
	// creating constructor for Webdriver
	
	public LoginOpeninApp(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	// 
	@FindBy(xpath = "//p[@class='text-base leading-6 font-semibold tracking-wide']") private WebElement btnLogin;//using this line able to find element that present onapplication
	
	@FindBy(xpath = "(//button[@class='inline-flex items-center justify-center whitespace-nowrap gap-2 select-none h-12 w-full bg-gray100 border-none rounded-xl px-4 py-3 text-base text-text-primary font-ftSemibold'])[1]") private WebElement btncontinue;
	@FindBy(xpath = "//input[@name='identifier']") private WebElement email;//using this line able to find element that present onapplication
	@FindBy(xpath = "(//span[@class='VfPpkd-vQzf8d'])[2]") private WebElement btnNext;//using this line able to find element that present onapplication
	@FindBy(xpath = "//input[@name='Passwd']") private WebElement password;//using this line able to find element that present onapplication
	@FindBy(xpath = "(//span[@class='VfPpkd-vQzf8d'])[2]") private WebElement btnNextpass;//using this line able to find element that present onapplication
	

	//getter methods for accessing private element

	public WebElement getBtnLogin() {
		return btnLogin;
	}
	public WebElement getBtncontinue() {
		return btncontinue;
	}

	public WebElement getEmail() {
		return email;
	}
	public WebElement getBtnNext() {
		return btnNext;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getBtnNextpass() {
		return btnNextpass;
	}

	public void Login() throws InterruptedException { //method for doing any action while accessing getter method
		btnLogin.click();
		btncontinue.click();
		
		email.sendKeys("abcx26483@gmail.com");
		btnNext.click();
		password.sendKeys("abcxyz@123");
		
		btnNextpass.click();
		
	}
	
	
}
