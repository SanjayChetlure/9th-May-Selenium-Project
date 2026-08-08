package S1_Locator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex7_Name
{
    public static void main(String[] args)
    {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///D:/Java/Batches/2026/9th%20May%202026/Html%20files/name.html");

        //enter UN
        driver.findElement(By.name("abc123")).sendKeys("abc");

        //enter pwd
        driver.findElement(By.name("xyz123")).sendKeys("xyz");
    }
}
