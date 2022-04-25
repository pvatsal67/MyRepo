package stepDefination;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import page.LoginPage;

public class LoginStepsDefinition {
	LoginPage lp = new LoginPage();
	
	@Given("user already on Login Page")
	public void user_already_on_login_page() {
	   lp.openBrwoser();
	   lp.openWebPage();
	    
	}

	@When("title of login page is {string}")
	public void title_of_login_page_is(String title) {
String expected = title;	    
String actual =  lp.getTitle();
Assert.assertEquals(expected, actual);

	}
	

	@Then("user enters {string} and {string}")
	public void user_enters_and(String email, String pass) {
	    lp.emailandpass(email, pass);
	    
	}

	@Then("user clicks on login button")
	public void user_clicks_on_login_button() throws InterruptedException {
	    lp.loginButton();
	    Thread.sleep(3000);
	}

	@Then("user get error message")
	public void user_get_error_message() {
	   
	   String act = lp.readErr();
	   System.out.println(act);
	}

	@Then("user quit")
	public void user_quit() {
	   lp.closeBrwoser();
	}

	}
	

