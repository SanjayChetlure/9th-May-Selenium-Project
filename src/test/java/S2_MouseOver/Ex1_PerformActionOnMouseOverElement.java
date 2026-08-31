package S2_MouseOver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ex1_PerformActionOnMouseOverElement
{
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com/");
        Thread.sleep(2000);

        //click on close icon
        driver.findElement(By.xpath("//span[@class='b3wTlE']")).click();
        Thread.sleep(2000);

        
        //Step1: Identify mouse over element
        WebElement login = driver.findElement(By.xpath("//span[text()='Login']"));

        //Step2: Create an object of Actions class with webdriver object as a input
        Actions act=new Actions(driver);

        //step3: call Actions class method-moveToElement()
        act.moveToElement(login).perform();
        Thread.sleep(2000);

        //click on Order link from mouse over element
        driver.findElement(By.xpath("//div[text()='Orders']")).click();

    }
}
