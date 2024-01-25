package CodingAssingment10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;
import java.util.List;

public class FitnessExercisePageTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://qafitnesslib.ccbp.tech/");
        driver.manage().window().maximize();
        Wait<WebDriver>wait=new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(5))
                .pollingEvery(Duration.ofMillis(500));
        List<WebElement> list1=driver.findElements(By.cssSelector("ul[id='categoryList']>li"));
        for(WebElement s:list1){
            s.click();
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("ul[id='categoryList']>li")));
        }
        List<WebElement>list2=driver.findElements(By.cssSelector("div[id='exerciseList']>div"));
        for(WebElement s1:list2){
            s1.click();
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[id='exerciseList']")));

        }
        List<WebElement>list3=driver.findElements(By.cssSelector("div[id='exercise']>div>ol>li"));
        for(WebElement s2:list3){
            System.out.println(s2.getText());
        }
    }
}
