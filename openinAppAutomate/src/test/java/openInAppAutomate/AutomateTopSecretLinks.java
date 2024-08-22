package openInAppAutomate;

import java.awt.HeadlessException;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.InstagramPage;
import Pages.LoginOpeninApp;
import Pages.TopSecretLink1;
import Pages.TopSecretLink2;
import Pages.TopSecretLink3;
import Pages.TopSecretLink4;
import generics.BaseTest;

public class AutomateTopSecretLinks extends BaseTest{ //extending basetest class 
	LoginOpeninApp la; // global variable of LoginOpeninApp class for accesiing there properties
	Properties pr ;  // global variable of Properties for accesiing there properties from basic file
	InstagramPage ip; // global variable of InstagramPage class  for accesiing there properties from InstagramPage class
	TopSecretLink1 tl; // global variable of TopSecretLink1 class  for accesiing there properties from  TopSecretLink1 class
	TopSecretLink2 tl2;// global variable of TopSecretLink2 class  for accesiing there properties from  TopSecretLink1 class
	TopSecretLink3 tl3;// global variable of TopSecretLink3 class  for accesiing there properties from  TopSecretLink1 class
	TopSecretLink4 tl4;// global variable of TopSecretLink4 class  for accesiing there properties from  TopSecretLink1 class
	
	
	@BeforeMethod // this before method should execute first at once, means execute before test method
	public void login() throws InterruptedException {
		pr=new Properties();//accessing properties from properties file
		la=new LoginOpeninApp(driver);//accessing data of Login method from  LoginOpeninApp class
		
		la.Login();	
	}

	@Test(priority = 1) // test case that have priority one, means this test case execute first 
	public void secretLink1() throws HeadlessException, UnsupportedFlavorException, IOException, InterruptedException {

	tl=new TopSecretLink1(driver);
	tl.secretLinkCreate();//accessing data of secretLinkCreate method from  TopSecretLink1 class
	
	}
	
	@Test(priority = 2)// test case that have priority two, means this test case execute second 
	public void secretLink2() throws HeadlessException, UnsupportedFlavorException, IOException {
		
		tl2=new TopSecretLink2(driver);
		tl2.secretLinkCreate2();//accessing data of secretLinkCreate2 method from  TopSecretLink2 class
		
	
	}
	
	@Test(priority = 3)// test case that have priority three, means this test case execute on their priority  
	public void secretLink3() throws HeadlessException, UnsupportedFlavorException, IOException {
		
		tl3=new TopSecretLink3(driver);
		tl3.secretLinkCreate3();//accessing data of secretLinkCreate3 method from  TopSecretLink3 class
		
	}
	
	@Test(priority = 4)// test case that have priority four, means this test case execute on their priority 
	public void secretLink4() throws HeadlessException, UnsupportedFlavorException, IOException {
		
		tl4=new TopSecretLink4(driver);
		tl4.secretLinkCreate4();//accessing data of secretLinkCreate4 method from  TopSecretLink4 class
		
	}
	
	
	@AfterTest // test case that have priority last, means this test case execute after completing each test 
	public void instaLogIn() throws InterruptedException {

		driver.get("https://www.instagram.com/");// using get method opening instagram application
		ip.loginInstagram();//accessing data of loginInstagram method from  logininapp class
			
	}
}
