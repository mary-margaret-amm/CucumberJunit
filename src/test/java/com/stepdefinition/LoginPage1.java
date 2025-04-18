package com.stepdefinition;

import io.cucumber.java.en.*;

public class LoginPage1 {

@Given("Lauch the URL")
public void lauch_the_url() {
    System.out.println("Launching URL");
}
@When("Enter the Username {string}")
public void enter_the_username(String user) {
    System.out.println(user);
    }
@When("Enter the password {string}")
public void enter_the_password(String pass) {
    System.out.println(pass);
}
@When("Click the login Button")
public void click_the_login_button() {
    System.out.println("LoginButtonClick");
}
@Then("Validate the HomePage")
public void validate_the_home_page() {
    System.out.println("Validate home page");
}

}
