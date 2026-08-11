package S1_WebElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex1_SendKeys
{
    public static void main(String[] args)
    {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");

        //Enter Name
        //Apr1
//        driver.findElement(By.xpath("//input[@id='name']")).sendKeys("abc");

        //Apr2:
        WebElement s1 = driver.findElement(By.xpath("//input[@id='name']"));
        s1.sendKeys("abc");
    }
}
