package testcases;

import java.time.Duration;

import pages.Knowledge_center;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;
import io.qameta.allure.Story;
import pages.Homepage;
import pages.Happy_Clients;
import pages.Search_box;
public class Cases {
	WebDriver driver;
	Homepage obj;
	Happy_Clients obj1;
	Search_box obj2;
	Knowledge_center obj3;
	
	
	@BeforeClass
	public void object() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		obj=new Homepage(driver);
		obj1=new Happy_Clients(driver);
		obj2=new Search_box(driver);
		obj3=new Knowledge_center(driver);
	}
	@Test(description="Clicking on Our QA Services")
	@Description("Test on QA_Services")
//	  @Epic("EP001")
//	  @Feature("Feature1:Verify QA_Services")
//	  @Story("Story:Clicking on QA_Services")
//	  @Severity(SeverityLevel.NORMAL)
	public void AHome_Pages() {
		obj.Trigger_url("https://testmatick.com/");
		obj.QA();
	    Assert.assertEquals(obj.Verify_QA(), "TestMatick is a leading provider of QA services.");
	   
	}
	@Test(description="Clicking on Happy Clients")
	@Description("Test on Happy_Clients")
//	  @Epic("EP001")
//	  @Feature("Feature1:Verify Happy_Clients")
//	  @Story("Story:Clicking on Happy_Client")
//	  @Severity(SeverityLevel.NORMAL)
	public void BHappyClients() {
		obj1.Happyclients();
		Assert.assertEquals(obj1.verify_testinominal(), "TESTIMONIALS");
	}
////	@Test(description="Verify Search_box")
////	@Epic("EP001")
////	public void CSearchBox() {
////		obj2.SearchBox();
////		obj2.SubmitButton();
////	//	Assert.assertEquals(obj2.verify_Text(), "RISKS OF TESTING OUTSOURCING TO INDIA");
////	}
//	@Test(description="Verify to click Knowledge Center ")
//	@Step("VErify the knowledge center")
//	@Epic("EP001")
//	public void  DKnowledgeCenter() {
//		obj3.Knowledge();
//		Assert.assertEquals(obj3.Verify_Text(), "SOFTWARE TESTING TOOLS");
//		obj3.Next_Page();
//		Assert.assertEquals(obj3.Verify2(),"STAY CONNECTED");
//	}

	@AfterClass
	public void Windowclose() {
		driver.quit();
	}
	

}
