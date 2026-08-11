package S1_WebElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex2_Clear
{
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");

        //Enter Name
        //Apr1
//        driver.findElement(By.xpath("//input[@id='name']")).sendKeys("abc");
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("//input[@id='name']")).clear();
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("//input[@id='name']")).sendKeys("xyz");

        //Apr2
        WebElement s1 = driver.findElement(By.xpath("//input[@id='name']"));
        s1.sendKeys("abc");
        Thread.sleep(2000);
        s1.clear();
        Thread.sleep(2000);
        s1.sendKeys("xyz");
    }
}
