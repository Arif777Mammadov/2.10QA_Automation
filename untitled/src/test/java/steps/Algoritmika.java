package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Algoritmika {

    WebDriver chrome;

    @Given("Go to algoritmika")
    public void go_to_algoritmika(){

        System.setProperty("webdriver.chrome.driver", "src/test/resources/Driver/chromedriver.exe");
        chrome = new ChromeDriver();
        chrome.manage().window().maximize();
        chrome.get("https://algoritmika.org/ru");
    }

    @When("Click log in button")
    public void click_log_in_button() throws InterruptedException {
        WebElement loginButton = chrome.findElement(By.className("login-button"));
        loginButton.click();
        Thread.sleep(3000);
    }

    @And("Fill login input")
    public void fill_login_input(){
        WebElement loginInput = chrome.findElement(By.xpath("//input[@value='']"));
        loginInput.click();
        loginInput.sendKeys("amammadov1058");
        //loginInput.sendKeys(Keys.ENTER);
    }

    @Then("Press next button")
    public void press_next_button(){
        WebElement nextButton = chrome.findElement(By.xpath("//button[@type='submit']"));
        nextButton.click();
    }

    @When("Fill password input")
    public void fill_password_input() throws InterruptedException {
        Thread.sleep(3000);
        WebElement passInput = chrome.findElement(By.xpath("//input[@type='password']"));
        passInput.click();
        passInput.sendKeys("6244");
    }

    @Then("Press Enter button")
    public void press_enter_button(){
        WebElement enterButton = chrome.findElement(By.xpath("//button[@type='submit']"));
        enterButton.click();
    }
}
