package CodingAssingment10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FlightBookingPageTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://qaflightbooking.ccbp.tech/");
        driver.manage().window().maximize();
        WebElement el1= driver.findElement(By.cssSelector("div[class='container']>form>input:nth-child(3)"));
        el1.sendKeys("New York");
        WebElement el2= driver.findElement(By.cssSelector("input[id='destinationCity']"));
        el2.sendKeys("Los Angeles");
        WebElement el3= driver.findElement(By.cssSelector("input[id='travelDate']"));
        el3.sendKeys("01/08/2023");
        WebElement el4= driver.findElement(By.cssSelector("input[id='passengers']"));
        el4.sendKeys("2");
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
        WebElement el5=wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[id='searchBtn']")));
        el5.click();
        WebElement el6=wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input[type='radio']:nth-child(1)")));
        el6.click();
        WebElement el7= wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div[class='container']>button")));
        el7.click();
        WebElement el8= driver.findElement(By.cssSelector("input[type='password']"));
        el8.sendKeys("traveler123");
        WebElement el9=wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div[class='container']>button")));
        el9.click();
        WebElement el10= driver.findElement(By.cssSelector("div[class='container']>h2"));
        System.out.println(el10.getText());
        driver.quit();

    }
}
