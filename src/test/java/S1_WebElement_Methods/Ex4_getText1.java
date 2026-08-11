package S1_WebElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex4_getText1
{
    public static void main(String[] args)
    {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");

        //get text from header element
       String actHeaderText=driver.findElement(By.xpath("//h1[@class='title']")).getText();
       System.out.println(actHeaderText);

        System.out.println("----");

        System.out.println(driver.findElement(By.xpath("//h1[@class='title']")).getText());

         }
}
