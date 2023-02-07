package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import io.qameta.allure.Step;

public class Search_box {
	WebDriver driver;
	public Search_box(WebDriver driver) {
		this.driver=driver;
	}
	By searchbox=By.xpath("//form[@class=\"search\"]//input[@id=\"s\"]");
	By search_button=By.xpath("//form[@id=\"searchform\"]//div//button[@id=\"searchsubmit\"]");
	By Verify=By.xpath("//div[@class=\"post_item\"]//h3");
	
	
	
	@Step("Searching Searchbox and enter Elements")
	public void SearchBox() {
		driver.findElement(searchbox).sendKeys("India");
	}
	@Step("Clicking on Submit button")
	public void SubmitButton() {
		driver.findElement(search_button).click();
	}
	@Step("Verify on same page")
	public String verify_Text() {
		String str=driver.findElement(Verify).getText();
		return str;
		
	}

}
