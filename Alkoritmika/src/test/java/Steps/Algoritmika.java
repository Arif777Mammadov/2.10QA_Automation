package Steps;

import Driver.Driver;
import Elements.GeneralElements;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Algoritmika {

    protected WebDriver chrome = Driver.getDriver();


    @Given("Go to algoritmika")
    public void go_to_algoritmika(){
        chrome.get("https://algoritmika.org/ru");
    }

    GeneralElements page = new GeneralElements(chrome);

    @When("Click log in button")
    public void click_log_in_button() throws InterruptedException {
        page.go_to_login();
    }

    @And("Fill login input")
    public void fill_login_input(){
        page.insert_login();
        //loginInput.sendKeys(Keys.ENTER);
    }

    @Then("Press next button")
    public void press_next_button(){
        page.submit();
    }

    @When("Fill password input")
    public void fill_password_input() throws InterruptedException {
        page.insert_password();
    }

    @Then("Press Enter button")
    public void press_enter_button(){
        page.submit();
    }

    @When("Select desired module")
    public void select_module() throws InterruptedException {
        page.select_section();
    }

    @Then("Click on desired task")
    public void select_task() throws InterruptedException {
        page.select_tsk();
    }

    //
}