package CodingAssingment10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProductReviewPageTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://qaproductrvw.ccbp.tech/product/");
        driver.manage().window().maximize();
        WebElement el1= driver.findElement(By.cssSelector("h1[class='product-name']"));
        System.out.println(el1.getText());
        WebElement el2= driver.findElement(By.cssSelector("button>a"));
        el2.click();
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.urlToBe("https://qaproductrvw.ccbp.tech/review"));
        String Str1="https://qaproductrvw.ccbp.tech/review";
        String Str2= driver.getCurrentUrl();
        if(Str1.equals(Str2)){
            System.out.println("Navigated to Review page");
        }
        WebElement el3= driver.findElement(By.cssSelector("select[id='ratingSelect']"));
        Select sc=new Select(el3);
        sc.selectByValue("5");
        WebElement el4= driver.findElement(By.cssSelector("textarea[id='reviewTextArea']"));
        el4.sendKeys("Great quality, reasonable price, and high rating. Highly recommended!");
        WebElement el5= driver.findElement(By.cssSelector("button[id='submitReviewBtn']"));
        el5.click();

        wait.until(ExpectedConditions.urlToBe("https://qaproductrvw.ccbp.tech/product"));
        String Str3="https://qaproductrvw.ccbp.tech/product";
        String Str4= driver.getCurrentUrl();
        if(Str3.equals(Str4)){
            System.out.println("Navigated to Product page");
        }
        driver.quit();
    }

}
