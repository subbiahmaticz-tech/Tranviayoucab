package definition;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class ride {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//launch the website
		driver.get("https://contorls-pwrs.tranviayoucab.com/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//username
		WebElement username = driver.findElement(By.id("emailid"));
		username.sendKeys("youcab@gmail.com");
		//password
		WebElement pwd = driver.findElement(By.id("password"));
		pwd.sendKeys("Lpss@123");
		//loginbtn
		WebElement btn = driver.findElement(By.xpath("//div[@class=\"btn btn-block btn-primary btn-lg font-weight-medium auth-form-btn convert_btn reset_btn login_hover\"]"));
		btn.click();
		
		driver.findElement(By.xpath("//button[text() = 'Maybe Later']")).click();
		//outstation
		WebElement outstation = driver.findElement(By.linkText("Outstation"));
		outstation.click();
		//createride
		WebElement createride = driver.findElement(By.xpath("//a[@href='/driver-details']//div[@class='report pads d-flex align-items-center justify-content-between']"));
		createride.click();
		//addpost
		WebElement addpost = driver.findElement(By.xpath("//button[text() = 'Add Post']"));
		addpost.click();
		//enterprice
		WebElement price = driver.findElement(By.id("price"));
		price.sendKeys("2300");
		//entercommission
		WebElement commision = driver.findElement(By.id("adminCommission"));
		commision.sendKeys("960");
		//tripdate
		WebElement date = driver.findElement(By.id("date"));
		date.sendKeys("05/20/2026");
		//triptime
		WebElement time = driver.findElement(By.id("time"));
		time.sendKeys("08:20AM");
		//pickup
		WebElement pickup = driver.findElement(By.id("pickup"));
		pickup.sendKeys("Nagamalaipudukottai, Tamil Nadu 625019, India");
		//drop
		WebElement drop = driver.findElement(By.id("drop"));
		drop.sendKeys("Kayathar, Tamil Nadu 628952, India");
		//requirement
		WebElement requirment = driver.findElement(By.id("extraRequirement"));
		requirment.sendKeys("AC");
		//submitbtn
		WebElement submit = driver.findElement(By.xpath("//button[text() = 'Submit']"));
		submit.click();

	}

}
