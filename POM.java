package TrelloTask;

import java.time.Duration;
import java.util.Random;

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
	
	
	@FindBy(xpath = "//a[@class='Buttonsstyles__Button-sc-1jwidxo-0 kTwZBr']")
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
	
	@FindBy(xpath = "//a[@class='quick-card-editor-buttons-item']//child::span[@class='quick-card-editor-buttons-item-text']")
	WebElement openCardButton;
	
	@FindBy(xpath = "//a[@class='button-link js-archive-card']//child::span[@class='js-sidebar-action-text']")
	WebElement archeiveButton;
	
	@FindBy(xpath = "//a[@class='button-link js-delete-card negate']")
	WebElement deleteButton;
	
	@FindBy(xpath = "//input[@class='js-confirm full nch-button nch-button--danger']")
	WebElement confirmDeleteButton;
	
	@FindBy(xpath = "//a[@class='BIOyZdkbd7KotX _7xO25yaQAbZ4cb']")
	WebElement boardConfirmation;
	
	
	public void Login() throws InterruptedException  {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='Buttonsstyles__Button-sc-1jwidxo-0 kTwZBr']")));
		loginButton1.click();
		//log.info("loginButton1 is clicked");

		wait.until(ExpectedConditions.visibilityOf(emailField));
		emailField.sendKeys("taimoorahmedpal123@gmail.com");
		//log.info("Keys entered into the emailField");

		wait.until(ExpectedConditions.visibilityOf(continueButton));
		continueButton.click();
		//log.info("continueButton is clicked");

		wait.until(ExpectedConditions.visibilityOf(passwordField));
		passwordField.sendKeys("Taimoorpal123");
		//log.info("Keys entered into the passwordField");

		wait.until(ExpectedConditions.visibilityOf(loginButton2));
		loginButton2.click();
		//log.info("loginButton2 is clicked");

		wait.until(ExpectedConditions.visibilityOf(createButton));
		Assert.assertTrue(createButton.isDisplayed());


		
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
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(createButton));
		createButton.click();
		//log.info("createButton is clicked");

		wait.until(ExpectedConditions.visibilityOf(createBoardButton));
		createBoardButton.click();
		//log.info("createBoardButton is clicked");

		wait.until(ExpectedConditions.visibilityOf(boardTitleField));
		boardTitleField.sendKeys(RandomName());
		//log.info("Keys entered into the boradTitleField");

		wait.until(ExpectedConditions.visibilityOf(createClickButton));
		createClickButton.click();
		//log.info("createClickButton is clicked");

		wait.until(ExpectedConditions.visibilityOf(boardConfirmation));
		Assert.assertTrue(boardConfirmation.isDisplayed());
	}
	public void CreateFirstList() {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(addAnotherList));
		//log.info("addAnotherList is clicked");

		addAnotherList.click();
		name1 = RandomName();
		wait.until(ExpectedConditions.visibilityOf(list1InputField));
		list1InputField.sendKeys(name1);
		//log.info("keys send to the list1InputField");

		wait.until(ExpectedConditions.visibilityOf(addListButton));
		addListButton.click();
		//log.info("addListButton is clicked");
		wait.until(ExpectedConditions.visibilityOf(list2InputField));
		Assert.assertTrue(list2InputField.isDisplayed());

	}
	public void CreateSecondListList() {
		name2 = RandomName();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(list2InputField));

		list2InputField.sendKeys(name2);
		//log.info("keys send to the list2InputField");

		wait.until(ExpectedConditions.visibilityOf(addListButton));
		addListButton.click();
		//log.info("addListButton is clicked");

		wait.until(ExpectedConditions.visibilityOf(list3InputField));
		Assert.assertTrue(list3InputField.isDisplayed());

	}
	public void AddCard() {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(addACardButton1));
		addACardButton1.click();
		//log.info("addACardButton1 is clicked");

		name3 = RandomName();
		wait.until(ExpectedConditions.visibilityOf(cardDescriptionField1));
		cardDescriptionField1.sendKeys(name3);
		//log.info("Keys send to the cardDescriptionField1");

		wait.until(ExpectedConditions.visibilityOf(addACardButton2));
		
		addACardButton2.click();
		//log.info("addACardButton2 is clicked");

		wait.until(ExpectedConditions.visibilityOf(cardDescriptionField2));
		Assert.assertTrue(cardDescriptionField2.isDisplayed());
		wait.until(ExpectedConditions.visibilityOf(closeCardDescription));
		closeCardDescription.click();
		//log.info("closeCardDescription is clicked");


	}
	public void MoveCard() {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		Actions a = new Actions(driver);
		wait.until(ExpectedConditions.visibilityOf(cardEditOption));
		a.moveToElement(cardEditOption).contextClick().build().perform();
		//log.info("cardEditOption is selected");

		wait.until(ExpectedConditions.visibilityOf(edit_MoveOption));
		edit_MoveOption.click();
		//log.info("edit_MoveOption is clicked");

		//wait.until(ExpectedConditions.visibilityOf(droppingLocation));
		Select act=new Select(droppingLocation);
		//log.info("DropDown selected");

		act.selectByVisibleText(name2);
		//log.info("File Location is selected");

		wait.until(ExpectedConditions.visibilityOf(moveButton));
		moveButton.click();
		//log.info("moveButton is clicked");
		//log.info("Card moved successfully");

		//Assert.assertEquals(cardEditOption.getText(),name2);
	}
	
	public void DeleteCard() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		Actions a = new Actions(driver);
		a.moveToElement(cardEditOption).contextClick().build().perform();
		//log.info("cardEditOption is selected");

		wait.until(ExpectedConditions.visibilityOf(openCardButton));
		openCardButton.click();
		//log.info("openCardButton is clicked");

		wait.until(ExpectedConditions.visibilityOf(archeiveButton));
		archeiveButton.click();
		//log.info("archeiveButton is clicked");

		wait.until(ExpectedConditions.visibilityOf(deleteButton));
		deleteButton.click();
		wait.until(ExpectedConditions.visibilityOf(confirmDeleteButton));
		
		//log.info("confirmDeleteButton is clicked");
		confirmDeleteButton.click();
		//log.info("Card is Deleted");

		}
	
	public void editcardname() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		Actions a = new Actions(driver);
		a.moveToElement(cardEditOption).contextClick().build().perform();
		//log.info("cardEditOption is clicked");
		wait.until(ExpectedConditions.visibilityOf(editButton));
		//log.info("Keys sent to the editButton Field");
		editButton.sendKeys("newcardname");
		wait.until(ExpectedConditions.visibilityOf(saveButton));
		//log.info("saveButton is clicked ");
		saveButton.click();
		//log.info("Card name is edited");

		}
	
	
	public POM(WebDriver driver) {
		this.driver = driver;
		// This initElements method will create all WebElements
		PageFactory.initElements(driver, this);

	}
}