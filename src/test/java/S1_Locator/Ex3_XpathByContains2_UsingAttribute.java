package S1_Locator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex3_XpathByContains2_UsingAttribute
{
    public static void main(String[] args)
    {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");

        //Enter Name
        driver.findElement(By.xpath("//input[contains(@placeholder,'Name')]")).sendKeys("abc");

        //enter Email
        driver.findElement(By.xpath("//input[contains(@id,'mail')]")).sendKeys("xyz");

    }
}
