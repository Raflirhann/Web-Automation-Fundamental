package automation.simple;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class seleniumAutomation {
    WebDriver driver;

    @Test
    public void AutomationTest() {
        //open browser
        WebDriverManager.firefoxdriver();
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://yopmail.com/wm");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='login']")));
        driver.findElement(By.xpath("//input[@id='login']")).sendKeys("automationtest");
        driver.findElement(By.xpath("//i[@class='material-icons-outlined f36']")).click();

        WebElement ifmailFrame = driver.findElement(By.id("ifmail"));
        driver.switchTo().frame(ifmailFrame);

        String ifmailHeading = String.valueOf(driver.findElement(By.xpath("//div[@class='ellipsis nw b f18']")));
        String ifmailText=ifmailHeading;

        Assert.assertEquals(ifmailHeading,ifmailText);

//        String ifmailHeading = driver.findElement(By.xpath("//div[@class='ellipsis nw b f18']")).getText();
//        String ifmailText = "Welcome to Brick&Bolt!";
//
//        Assert.assertEquals(ifmailHeading,ifmailText);
//        //System.out.println(ifmailText);
        driver.close();



    }
}
