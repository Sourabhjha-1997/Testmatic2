package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import io.qameta.allure.Step;

public class Happy_Clients {
	WebDriver driver;
	public Happy_Clients(WebDriver driver) {
		this.driver=driver;
	}
	By HappyClients=By.xpath("//li[@id=\"menu-item-26347\"]");
	By Testinominal=By.xpath("//ul[@class=\"sub-menu\"]//a[contains(@href,'testimonials')]/span");
	By VerifyText=By.xpath("//div[@class=\"page_heading\"]//h1");
	
	
	
	@Step("Mouse hover on Happy Clients")
	public void Happyclients() {
		WebElement elt=driver.findElement(HappyClients);
		Actions act=new Actions(driver);
		act.moveToElement(elt).perform();
		driver.findElement(Testinominal).click();
	}
	@Step("Verify text in same page")
	public String verify_testinominal() {
		String mtr=driver.findElement(VerifyText).getText();
		return mtr;
	}

}
