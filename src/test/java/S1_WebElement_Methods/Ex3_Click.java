package S1_WebElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex3_Click
{
    public static void main(String[] args)
    {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");

        //select male radio button
        driver.findElement(By.xpath("//input[@id='male']")).click();

        //click on sunday checkbox
        driver.findElement(By.xpath("//input[@id='sunday']")).click();
    }
}
