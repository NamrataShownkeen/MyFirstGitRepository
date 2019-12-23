package skeleton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FirstCucumber {
				WebDriver driver;	

			  	
		@Given("User is on the TestMeApp home page")
		public void user_is_on_the_TestMeApp_home_page() {
		    // Write code here that turns the phrase above into concrete actions
		   // throw new cucumber.api.PendingException();
		  
		    System.setProperty("webdriver.chrome.driver", "C:\\Namrata\\chromedriver_win32\\chromedriver.exe");
		    driver= new ChromeDriver();	
	
			driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm"); 

		}

		@When("The user enters valid login and valid password")
		public void the_user_enters_valid_login_and_valid_password() {
		    // Write code here that turns the phrase above into concrete actions
		   // throw new cucumber.api.PendingException();
			driver.findElement(By.linkText("SignIn")).click();
		    driver.findElement(By.name("userName")).sendKeys("Lalitha");
		    driver.findElement(By.name("password")).sendKeys("password123");
		    driver.findElement(By.name("Login")).click();
		    
		}

		@Then("The user should be redirected to the next page")
		public void the_user_should_be_redirected_to_the_next_page() {
		    // Write code here that turns the phrase above into concrete actions
		    //throw new cucumber.api.PendingException();
		    //String userName = driver.findElement(By.cssSelector("ul.nav.navbar-nav")).getText();
		    
		    System.out.println("-------------------------");
		    System.out.println("Login Sucessful");
		    driver.close();
		    
		}


}
