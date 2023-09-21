package stepDefination;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDef {
    WebDriver driver;

    @Given("Setup browser driver and navigate to the home page.")
    public void setup_browser_driver_and_navigate_to_the_home_page() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://localhost:8080/home");
        System.out.println("home Page");
    }

    @When("Verify the tittle is homepage.")
    public void Verify_the_tittle_is_homepage() throws InterruptedException {
        String tittle = driver.getTitle();
        Assert.assertEquals("Home", tittle);
        System.out.println("checking home Page");
        Thread.sleep(1000);
    }

    @Then("Select login option.")
    public void Select_login_option() throws InterruptedException {
        WebElement button = driver.findElement(By.xpath("//button[@type='submit']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", button);
        System.out.println("login button");
        Thread.sleep(1000);
    }

    @Then("Enter valid {string} and {string}.")
    public void Enter_valid_username_and_password(String username, String password) throws InterruptedException {
        driver.findElement(By.name("username")).sendKeys(username);
        driver.findElement(By.name("password")).sendKeys(password);
        System.out.println("email and password");
        Thread.sleep(1000);
    }

    @Then("Click on sign in button.")
    public void Click_on_sign_in_button() throws InterruptedException {
        WebElement button = driver.findElement(By.xpath("//button[@type='submit']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", button);
        System.out.println("Submit button");
        Thread.sleep(1000);
    }

    @And("Verify dashboard.")
    public void Verify_dashboard() throws InterruptedException {
        String tittle = driver.getTitle();
        Assert.assertEquals("View Items", tittle);
        System.out.println("home dashboard");
        Thread.sleep(1000);
    }

    @Then("Close the browser.")
    public void Close_the_browser() throws Exception {
        Thread.sleep(8000);
        driver.close();
        driver.quit();
        System.out.println("Close the browser");
    }

}
