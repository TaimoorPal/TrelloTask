package TrelloTask;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Main {
	WebDriver driver;
	POM obj = new POM(driver);
	@SuppressWarnings("static-access")
	@BeforeMethod
	public void Setup() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://trello.com/");
		//PropertyConfigurator.configure("log4j.properties");
		
	}
	
	@Test
	public void Login() throws InterruptedException {
		obj.Login();	
	}
	@Test
	public void CreateBoard() throws InterruptedException {
		obj.CreateBoard();
	}
	@Test
	public void MakeLists() throws InterruptedException {
		obj.CreateFirstList();
		obj.CreateSecondListList();
		
	}
	@Test
	public void AddCard() throws InterruptedException {
		obj.AddCard();
		
	}
	@Test
	public void MoveCard() throws InterruptedException {
		obj.MoveCard();
		
	}
	@Test
	public void EditCard() throws InterruptedException {
		obj.editcardname();
		
	}
	@Test
	public void DeleteCard() throws InterruptedException {
		obj.DeleteCard();
		
	}
	
	
}
