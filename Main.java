package TrelloTask;

import java.time.Duration;
import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class POM {

	WebDriver driver;
	String name1;
	String name2;
	String name3;
	Logger log1 = Logger.getLogger("POM");
	WebDriverWait wait;

	
	@FindBy(xpath = "c")
	WebElement loginButton1;
	
	@FindBy(xpath = "//input[@class='nch-textfield__input Hj0IB7nx8rs7UO Hj0IB7nx8rs7UO ysTE7s-UXRkpYP']")
	WebElement boardTitleField;
	
	@FindBy(xpath = "//p[contains(text(),'A board is made up of cards ordered on lists. Use it to manage projects, track information, or organize anything.')]")
	WebElement createBoardButton;
	
	@FindBy(xpath = "//button[@data-testid='header-create-menu-button']")
	WebElement createButton;
	
	@FindBy(xpath = "//button[@class='G2lWjDVJsvar3H Ts+YceGnvTbKoG HPCwi137Em5EYI JIXQq8gDYY04N6']")
	WebElement createClickButton;
	
	@FindBy(xpath = "//input[@id='user']")
	WebElement emailField;
	
	@FindBy(xpath = "//input[@type='submit']")
	WebElement continueButton;
	
	@FindBy(xpath = "//input[@name='password']")
	WebElement passwordField;
	
	@FindBy(xpath = "//button[@id='login-submit']")
	WebElement loginButton2;
	
	@FindBy(xpath = "//span[@class='placeholder']")
	WebElement addAnotherList;
	
	@FindBy(xpath = "//input[@class='list-name-input']")
	WebElement list1InputField;
	
	@FindBy(xpath = "//input[@class='nch-button nch-button--primary mod-list-add-button js-save-edit']")
	static
	WebElement addListButton;
	
	@FindBy(xpath = "//input[@class='list-name-input' and @type='text']")
	static
	WebElement list2InputField;
	
	@FindBy(xpath = "//*[@id=\"board\"]/div[1]/div/div[3]/a/span[2]")
	WebElement addACardButton1;
	
	@FindBy(xpath = "//input[@class='list-name-input']")
	static
	WebElement list3InputField;
	
	@FindBy(xpath = "//textarea[@class='list-card-composer-textarea js-card-title']")
	WebElement cardDescriptionField1;
	
	@FindBy(xpath = "//input[@class='nch-button nch-button--primary confirm mod-compact js-add-card']")
	WebElement addACardButton2;
	
	@FindBy(xpath = "//textarea[@class='list-card-composer-textarea js-card-title']")
	WebElement cardDescriptionField2;
	
	@FindBy(xpath = "//a[@class='icon-lg icon-close dark-hover js-cancel']")
	WebElement closeCardDescription;
	
	@FindBy(xpath = "//span[@class='list-card-title js-card-name']")
	WebElement cardEditOption;
	
	@FindBy(xpath = "//span[contains(text(),'Move')]")
	WebElement edit_MoveOption;
	
	@FindBy(xpath = "//select[@class='js-select-list']")
	WebElement droppingLocation;
	
	@FindBy(xpath = "//input[@class='nch-button nch-button--primary wide js-submit']")
	WebElement moveButton;
	
	@FindBy(xpath = "//textarea[@class='list-card-edit-title js-edit-card-title']")
	WebElement editButton;
	
	@FindBy(xpath = "//input[@class='nch-button nch-button--primary wide js-save-edits']")
	WebElement saveButton;
	
	@FindBy(xpath = "//a[@class='quick-card-editor-buttons-item']//child::span[@class='quick- card-editor-buttons-item-text']")
	WebElement openCardButton;
	
	@FindBy(xpath = "//a[@class='button-link js-archive-card']//child::span[@class='js-sidebar- action-text']")
	WebElement archeiveButton;
	
	@FindBy(xpath = "//a[@class='button-link js-delete-card negate']")
	WebElement deleteButton;
	
	@FindBy(xpath = "//input[@class='js-confirm full nch-button nch-button--danger']")
	WebElement confirmDeleteButton;
	
	@FindBy(xpath = "//a[@class='BIOyZdkbd7KotX _7xO25yaQAbZ4cb']")
	WebElement boardConfirmation;
	
	
	public void Login() throws InterruptedException  {
		wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='Buttonsstyles__Button-sc-1jwidxo-0 kTwZBr']\r\n")));
		loginButton1.click();
		log1.info("loginButton1 is clicked");//a[@class='Buttonsstyles__Button-sc-1jwidxo-0 kTwZBr']

		wait.until(ExpectedConditions.visibilityOf(emailField));
		emailField.sendKeys("taimoorahmedpal123@gmail.com");
		log1.info("Keys sent to emailField");

		wait.until(ExpectedConditions.visibilityOf(continueButton));
		continueButton.click();
		log1.info("continueButton is clicked");

		wait.until(ExpectedConditions.visibilityOf(passwordField));
		passwordField.sendKeys("Taimoorpal123");
		log1.info("Keys sent to passwordField");

		wait.until(ExpectedConditions.visibilityOf(loginButton2));
		loginButton2.click();
		log1.info("loginButton2 is clicked");

		wait.until(ExpectedConditions.visibilityOf(createButton));
		Assert.assertTrue(createButton.isDisplayed());
		log1.info("Assertion Passed so account is logged in");



		
	}
	
	public static String RandomName() {
		String[] name1 = {"FileName","File","Document","Text","Haha"};
		String[] name2 = {"CureMD1","Assignment","OfficeTask1","OfficeTask2","HomeWork"};
		Random ran = new Random();
		String randomName = (name1[ran.nextInt(name1.length)]+name2[ran.nextInt(name2.length)]);
		System.out.println(randomName);
		return randomName;
		

	}
	public void CreateBoard() {
		createButton.click();
		log1.info("createButton is clicked");

		createBoardButton.click();
		log1.info("createBoardButton is clicked");

		boardTitleField.sendKeys(RandomName());
		log1.info("RandomString is entered in to the boradTitleField ");

		createClickButton.click();
		log1.info("createClickButton is clicked");

		Assert.assertTrue(boardConfirmation.isDisplayed());
		log1.info("New Board is created");

	}
	public void CreateFirstList() {
		addAnotherList.click();
		log1.info("addAnotherList is clicked");

		name1 = RandomName();
		list1InputField.sendKeys(name1);
		log1.info("list1InputField is entered");

		addListButton.click();
		log1.info("addListButton is clicked");

		Assert.assertTrue(list2InputField.isDisplayed());
		log1.info("FirstList is created");


	}
	public void CreateSecondListList() {
		name2 = RandomName();
		list2InputField.sendKeys(name2);
		log1.info("keys entered into the list2InputField");

		addListButton.click();
		log1.info("addListButton is clicked");

		Assert.assertTrue(list3InputField.isDisplayed());
		log1.info("SecondList is created");
		

	}
	public void AddCard() {
		addACardButton1.click();
		log1.info("addACardButton1 is clicked");

		String name3 = RandomStringUtils.randomAlphabetic(15);
		cardDescriptionField1.sendKeys(name3);
		log1.info("keys entered into the cardDescriptionField1");

		addACardButton2.click();
		log1.info("addACardButton2 is clicked");

		Assert.assertTrue(cardDescriptionField2.isDisplayed());
		log1.info("card is created");

		closeCardDescription.click();
		log1.info("closeCardDescription is clicked");


	}
	public void MoveCard() {
		Actions a = new Actions(driver);
		wait.until(ExpectedConditions.visibilityOf(cardEditOption));
		a.moveToElement(cardEditOption).contextClick().build().perform();
		log1.info("cardEditOption is clicked");
		wait.until(ExpectedConditions.visibilityOf(edit_MoveOption));
		edit_MoveOption.click();
		log1.info("edit_MoveOption is clicked");
		Select act=new Select(droppingLocation);
		act.selectByValue(name1);
		log1.info("name2 value is selected from the dropdown");
		wait.until(ExpectedConditions.visibilityOf(moveButton));

		moveButton.click();
		log1.info("moveButton is clicked");

		Assert.assertEquals(cardEditOption.getText(),name1);
		log1.info("Card is moved");

	}
	
	public void DeleteCard() throws InterruptedException {
		Actions a = new Actions(driver);
		a.moveToElement(cardEditOption).contextClick().build().perform();
		log1.info("cardEditOption is clicked");

		Thread.sleep(4000);
		openCardButton.click();
		log1.info("openCardButton is clicked");

		Thread.sleep(4000);
		archeiveButton.click();
		log1.info("archeiveButton is clicked");

		Thread.sleep(4000);
		deleteButton.click();
		log1.info("deleteButton is clicked");

		Thread.sleep(4000);
		confirmDeleteButton.click();
		log1.info("confirmDeleteButton is clicked");

		}
	
	public void editcardname() throws InterruptedException {
		Actions a = new Actions(driver);
		a.moveToElement(cardEditOption).contextClick().build().perform();
		log1.info("cardEditOption is clicked");

		Thread.sleep(4000);
		editButton.sendKeys("newcardname");
		log1.info("editButton is clicked");

		Thread.sleep(4000);
		saveButton.click();
		log1.info("saveButton is clicked");

		Thread.sleep(4000);
		}
	
	
	public POM(WebDriver driver) {
		this.driver = driver;
		// This initElements method will create all WebElements
		PageFactory.initElements(driver, this);

	}
}
