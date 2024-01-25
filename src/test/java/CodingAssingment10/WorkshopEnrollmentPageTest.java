package CodingAssingment10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class WorkshopEnrollmentPageTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://qaworkshopenrl.ccbp.tech/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement el1 = driver.findElement(By.cssSelector("input[id='name']"));
        el1.sendKeys("George");
        WebElement el2 = driver.findElement(By.cssSelector("button[id='continueName']"));
        el2.click();
        WebElement el3= driver.findElement(By.cssSelector("input[id='email']"));
        el3.sendKeys("george@gmail.com");
        WebElement el4= driver.findElement(By.cssSelector("button[id='continueEmail']"));
        el4.click();
        WebElement el5= driver.findElement(By.cssSelector("input[id='react']"));
        el5.click();
       WebElement list1=driver.findElement(By.cssSelector("select[id='slot']"));
        Select sc=new Select(list1);
        sc.selectByValue("eleven");
        driver.findElement(By.cssSelector("button[id='submit']")).click();
        System.out.println("success message");
        driver.quit();
    }
}
