package pages;


import io.qameta.allure.Step;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;




public class Homepage {
	WebDriver driver;
	public Homepage(WebDriver driver) {
		this.driver=driver;
	}
	By QA_Service= By.xpath("//li[@id='menu-item-26346']//a[@class=\"no_border\"]");
	By QA_Automation =By.xpath("//ul[@class='sub-menu']//a[contains(@href,'automated-testing-services')]/span");
	By VerifyText=By.xpath("//div[@class=\"textwidget\"]//p[1]");
	
	
	
	@Step("Trigger Application Url ")
	public void Trigger_url(String url) {
		this.driver.get(url);
	}
	@Step("Mouse hover on QA services")
	public void QA() {
		WebElement ele=driver.findElement(QA_Service);
		Actions act=new Actions(driver);
		act.moveToElement(ele).perform();
		driver.findElement(QA_Automation).click();
		
	}
	@Step("Verifying Text for same page")
	public String Verify_QA() {
		String str=driver.findElement(VerifyText).getText();
		System.out.println(str);
		return str;
		
	}

}
