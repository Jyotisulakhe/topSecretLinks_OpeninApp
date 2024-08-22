package Pages;

import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TopSecretLink3 {
	WebDriver driver;
	public TopSecretLink3(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
}
	@FindBy(xpath = "(//p[@class='truncate whitespace-nowrap'])[7]") private WebElement topsecLinks;

	@FindBy(xpath = "//*[@id=\"__next\"]/div/div/div[1]/div/div[2]/div[3]/div/div[1]/div/button/div/p") private WebElement startBtn;

	@FindBy(xpath = "//button[@value='49']") private WebElement priceSet;
	@FindBy(xpath = "(//div[@class='flex gap-2 items-center'])[2]") private WebElement continuePrice;
	
	@FindBy(xpath = "//button[@value='Link']") private WebElement fileType;

	@FindBy(xpath = "//button[@class='bg-yellow rounded-2xl  w-full p-3 cursor-pointer border-none shadow-none hover:shadow-none false rounded-xl w-full py-3 undefined border border-black border-opacity-10 flex gap-4 justify-center items-center text-black  ']") 
	private WebElement continuefileType;
	@FindBy(xpath = "//input[@placeholder='Enter the Link']") private WebElement data;
	@FindBy(xpath = "//p[@class='text-base leading-6 font-semibold tracking-wide']") private WebElement continuedata;
	@FindBy(xpath = "//input[@placeholder='Content Title']") private WebElement addTitle;

	@FindBy(xpath = "//button[@class='bg-yellow rounded-2xl  w-full p-3 cursor-pointer border-none shadow-none hover:shadow-none false rounded-xl w-full py-3 undefined border border-black border-opacity-10 flex gap-4 justify-center items-center text-black  ']") private WebElement priview;

	@FindBy(xpath = "//p[@class='text-sm']") private WebElement btndescription;
	@FindBy(xpath = "//textarea[@placeholder='Write a brief about your exclusive content']") private WebElement description;

	@FindBy(xpath = "(//p[@class='text-base leading-6 font-semibold tracking-wide'])[3]") private WebElement savedesc;
	@FindBy(xpath = "//div[@class='z-10 flex flex-col items-center border-1']") private WebElement publish;
	
	@FindBy(xpath = "//button[@class='bg-yellow rounded-xl w-full py-3 cursor-default border-none shadow-none hover:shadow-none disabled:bg-disabledYellow rounded-lg w-full py-3 undefined border border-black border-opacity-10 flex gap-4 justify-center items-center transparent text-black  ']")
	private WebElement yespublish;

	@FindBy(xpath = "(//img[@style='position: absolute; inset: 0px; box-sizing: border-box; padding: 0px; border: none; margin: auto; display: block; width: 0px; height: 0px; min-width: 100%; max-width: 100%; min-height: 100%; max-height: 100%;'])[2]")
	private WebElement share;
	
	@FindBy(xpath = "(//img[@style='position: absolute; inset: 0px; box-sizing: border-box; padding: 0px; border: none; margin: auto; display: block; width: 0px; height: 0px; min-width: 100%; max-width: 100%; min-height: 100%; max-height: 100%;'])[2]")
	private WebElement link;
	
	@FindBy(xpath = "(//img[@alt='copy'])[1]") private WebElement linkCopy;


	public WebElement getTopsecLinks() {
		return topsecLinks;
	
	}
	
	public WebElement getStartBtn() {
		return startBtn;
	}

	public WebElement getPriceSet() {
		return priceSet;
	}
	
	public WebElement getContinuePrice() {
		return continuePrice;
	}

	public WebElement getFileType() {
		return fileType;
	}

	public WebElement getContinuefileType() {
		return continuefileType;
	}

	public WebElement getData() {
		return data;
	}

	public WebElement getContinuedata() {
		return continuedata;
	}
	
	public WebElement getAddTitle() {
		return addTitle;
	}

	public WebElement getPriview() {
		return priview;
	}

	public WebElement getbtnDescription() {
		return btndescription;
	}
	public WebElement getDescription() {
		return description;
	}
	public WebElement getSavedesc() {
		return savedesc;
	}

	public WebElement getPublish() {
		return publish;
	}
	public WebElement getyesPublish() {
		return yespublish;
	}

	public WebElement getshare() {
		return share;
	}
	public WebElement getlink() {
		return link;
	}

	public WebElement getlinkCopy() {
		return linkCopy;
	}
	
	public void secretLinkCreate3() throws HeadlessException, UnsupportedFlavorException, IOException {
		topsecLinks.click();
		startBtn.click();
		priceSet.click();
//		video1.click();
		continuePrice.click();
		fileType.click();
		continuefileType.click();
		data.sendKeys("https://docs.google.com/spreadsheets/d/1oz-tz5NsOay1tMZiXoioFCloHjjCj9VA/edit?usp=sharing&ouid=113053394257558002119&rtpof=true&sd=true");
		continuefileType.click();
		addTitle.sendKeys("Test Cases File");
		priview.click();
		
		publish.click();
		yespublish.click();
		share.click();
		link.click();
	WebElement lin=linkCopy;
	lin.click();

	String copiedLink3 = (String) Toolkit.getDefaultToolkit().getSystemClipboard().getData(DataFlavor.stringFlavor);

	
	System.out.println(copiedLink3);
	}
	
	
}
