package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Knowledge_center {
	WebDriver driver;
	public Knowledge_center(WebDriver driver) {
		this.driver= driver;
	}
	By Knowledge_Center=By.xpath("//div[@id='menu']//a[contains(text(),'Knowledge Center')]");
	By Dropdown=By.xpath("//ul[@class='sub-menu']//a[contains(@href,'software-testing-tools')]/span");
	By Next=By.xpath("//div[@class=\"pagination\"]//a[text()=\"2\"]");
	By verify=By.xpath("//div[@class=\"page_heading\"]//h1");
	By verify2=By.xpath("//div[@id=\"footer\"]//div[2]//h3");
	
	
	public void Knowledge() {
	WebElement mtr=driver.findElement(Knowledge_Center);
	Actions ele=new Actions(driver);
	ele.moveToElement(mtr).perform();
	System.out.println("Testing HOver");
	driver.findElement(Dropdown).click();
	}
	public String Verify_Text(){
		String ltr=driver.findElement(verify).getText();
		return ltr;
	}
	public void Next_Page() {
		driver.findElement(Next).click();
	}
	public String Verify2() {
		String mtr= driver.findElement(verify2).getText();
		return mtr;
	}

}
