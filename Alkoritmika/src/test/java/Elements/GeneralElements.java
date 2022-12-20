package Elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GeneralElements {
    public GeneralElements(WebDriver chrome){
        PageFactory.initElements(chrome, this);
    }


    @FindBy(className = "login-button")
    WebElement loginButton;//ok

    @FindBy(xpath = "//input[@value='']")
    WebElement loginInput;//ok

    @FindBy(xpath = "//button[@type='submit']")
    WebElement submit;//ok

    @FindBy(xpath = "//input[@type='password']")
    WebElement passInput;//ok

    //Here starts Profile Management stuff
    @FindBy(css = ".styles__Wrapper--15cxv60:nth-child(5) span:nth-child(2)")
    WebElement des_section;//now ok

    //driver.findElement(By.linkText("Войти"))
    @FindBy(xpath = "//a[@data-qa-task-id='52094']")
    WebElement des_task;

    public void go_to_login() throws InterruptedException {
        loginButton.click();
        Thread.sleep(3000);
    }

    public void insert_login(){
        loginInput.click();
        loginInput.sendKeys("amammadov1058");
    }

    public void submit(){
        submit.click();
    }

    public void insert_password() throws InterruptedException {
        Thread.sleep(3000);
        passInput.click();
        passInput.sendKeys("6244");
    }

    public void select_section() throws InterruptedException {
        Thread.sleep(5000);
        des_section.click();
    }

    public void select_tsk() throws InterruptedException {
        Thread.sleep(5000);
        des_task.click();
    }
}
