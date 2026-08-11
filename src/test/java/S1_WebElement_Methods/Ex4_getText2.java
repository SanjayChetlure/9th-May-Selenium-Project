package S1_WebElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex4_getText2
{
    public static void main(String[] args)
    {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");

        //get text of Home link
        String text=driver.findElement(By.xpath("(//a[text()='Home'])[1]")).getText();
        System.out.println(text);

        System.out.println("----");

        System.out.println(driver.findElement(By.xpath("(//a[text()='Home'])[1]")).getText());
    }
}
