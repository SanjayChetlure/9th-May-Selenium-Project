package S1_WebElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex6_isEnabled1
{
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.instagram.com/?hl=en");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//button[@class=' _aswp _aswq _aswu _asw_ _asx2']")).click();
        Thread.sleep(4000);

        boolean result = driver.findElement(By.xpath("//span[text()='Log in']")).isEnabled();
        System.out.println(result);

        if(result)
        {
            System.out.println("Element is enabled");
        }
        else
        {
            System.out.println("Element is disabled");
        }
    }
}
