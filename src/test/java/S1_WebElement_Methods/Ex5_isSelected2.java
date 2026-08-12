package S1_WebElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex5_isSelected2
{
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");

        driver.findElement(By.xpath("//input[@id='sunday']")).click();
        Thread.sleep(2000);

        boolean result = driver.findElement(By.xpath("//input[@id='sunday']")).isSelected();
        System.out.println(result);

        if(result)
        {
            System.out.println("Checkbox is selected");
        }
        else
        {
            System.out.println("Checkbox is De-Selected");
        }
    }
}
