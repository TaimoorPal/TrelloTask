package TrelloTask;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Main {
	WebDriver driver;
	POM obj;
	@BeforeTest
	public void Setup() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://trello.com/");
		//PropertyConfigurator.configure("log4j.properties");
		
	}
	
	@Test(priority=1)
	public void Login() throws InterruptedException {
		obj = new POM(driver);
		obj.Login();
	}
	@Test(priority=2)
	public void CreateBoard() throws InterruptedException {
		obj.CreateBoard();
	}
	@Test(priority=3)
	public void MakeLists() throws InterruptedException {
		obj.CreateFirstList();
		obj.CreateSecondListList();
		
	}
	@Test(priority=4)
	public void AddCard() throws InterruptedException {
		obj.AddCard();
		
	}
	@Test(priority=5)
	public void MoveCard() throws InterruptedException {
		obj.MoveCard();
		
	}
	@Test(priority=6)
	public void EditCard() throws InterruptedException {
		obj.editcardname();
		
	}
	@Test(priority=7)
	public void DeleteCard() throws InterruptedException {
		obj.DeleteCard();
		
	}
	@AfterTest
	public void Close() throws InterruptedException {
		Thread.sleep(3000);
		driver.close();
	}
	
	
}
