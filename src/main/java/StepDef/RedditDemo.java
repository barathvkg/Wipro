package StepDef;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utility.BaseDemo;

public class RedditDemo extends BaseDemo {
	public static BaseDemo base;

	By signinLink = By.linkText("Sign in");
	By accLink =By.xpath("//div[@Class='floatR rightwidth']/div/a");
	By fullName = By.xpath("//div[@id='wrapper']/table[2]/tbody/tr[3]/td[3]/input[@type='text']");
	By rediffId =By.xpath("//td[@valign='bottom']/input[@type='text']");
	By CheckAvailability= By.xpath("//td[@valign='bottom']/input[@type='button']");
	By password= By.id("newpasswd");
	By retypePwd =By.id("newpasswd1");
	By checkBox =By.className("nomargin");
	By securityQuestion= By.xpath("//div[@id='div_hintQS']/table[1]/tbody/tr[2]/td[3]/select");
	By answer= By.xpath("//div[@id='div_hintQS']/table[1]/tbody/tr[4]/td[3]/input");
	By motherName = By.xpath("//div[@id='div_hintQS']/table[1]/tbody/tr[6]/td[3]/input");
	By mobileNo =By.id("mobno");
	By dobDay =By.xpath("//tbody/tr[22]/td[3]/select[1]");
	By dobMonth= By.xpath("//tbody/tr[22]/td[3]/select[2]");
	By dobYear =By.xpath("//tbody/tr[22]/td[3]/select[3]");
	By gender =By.xpath("//input[@value='f']");
	By country =By.id("country");
	By captcha =By.className("captcha");
	By newAcc =By.id("Register");
	public void signin() {
		base.driver.findElement(signinLink).click();
		}
	public void accountCreation() { 
		base.driver.findElement(accLink).click(); 
		}
	public void enterDetails() {
		Scanner sc = new Scanner(System.in);
	base.driver.findElement(fullName).sendKeys("Barath");
	base.driver.findElement(rediffId).sendKeys("barathgopinathbg");
	base.driver.findElement (CheckAvailability).click();
	base.driver.findElement(password).sendKeys("2005850");
	base.driver.findElement(retypePwd).sendKeys("2005850");
	base.driver.findElement(checkBox).click();
	WebElement sq =base.driver.findElement(securityQuestion); 
	Select st =new Select(sq);
	st.selectByIndex(2);
	base.driver.findElement(answer).sendKeys("Answer"); 
	base.driver.findElement(motherName).sendKeys ("Mother");
	base.driver.findElement(mobileNo).sendKeys("8778824190");
	WebElement day= base.driver.findElement(dobDay); 
	Select d= new Select(day); d.selectByIndex(1);
	WebElement month =base.driver.findElement (dobMonth);
	Select m= new Select (month); m.selectByIndex(8);
	WebElement year =base.driver.findElement(dobYear); 
	Select y= new Select(year);
	y.selectByIndex(4);
	base.driver.findElement(gender).click();
	WebElement countrySelect= base.driver.findElement(country);
	Select cs= new Select(countrySelect); 
	cs.selectByIndex(1);
	WebDriverWait wait = new WebDriverWait(base.driver, Duration.ofSeconds(5));
	wait.until(ExpectedConditions.visibilityOfElementLocated (captcha));
	System.out.println("Enter capcha");
	base.driver.findElement(captcha).sendKeys(sc.nextLine());
	base.driver.findElement(newAcc).click();
	}
	public void creatAccount() {
		base.driver.findElement(newAcc).clear();
	}
	
}
