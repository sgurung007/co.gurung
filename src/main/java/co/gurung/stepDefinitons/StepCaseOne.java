package co.gurung.stepDefinitons;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepCaseOne {
    @Given("User is on Home Page")
    public void user_is_on_home_page() {
        System.out.println("suraj-User is on Home Page");
    }
    @When("User Navigate to LogIn Page")
    public void user_navigate_to_log_in_page() {
        System.out.println("suraj-User Navigate to LogIn Page");
    }
    @When("User enters UserName and Password")
    public void user_enters_user_name_and_password() {
        System.out.println("suraj-User enters UserName and Password");
    }
    @Then("Message displayed Login Successfully")
    public void message_displayed_login_successfully() {
        System.out.println("suraj-Message displayed Login Successfully");
    }
}
