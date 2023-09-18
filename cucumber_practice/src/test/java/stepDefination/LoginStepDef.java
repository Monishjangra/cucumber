package stepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDef {



@Given("user is on home page")
public void user_is_on_home_page() {
	System.out.println("home Page");
	
}

@When("tittle is home")
public void tittle_is_home() {
	System.out.println("checking home Page");
}

@Then("user click login button")
public void user_click_login_button() {
	System.out.println("login button");
}

@Then("user enter email and password")
public void user_enter_email_and_password() {
	System.out.println("email and password");
}

@Then("user click submit button")
public void user_click_submit_button() {
	System.out.println("Submit button");
}

@Then("user is navigated to home dashboard")
public void user_is_navigated_to_home_dashboard() {
	System.out.println("home dashboard");
}

}
