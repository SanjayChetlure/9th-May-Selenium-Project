package S1_Locator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex5_Tagname
{
    public static void main(String[] args)
    {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///D:/Java/Batches/2026/9th%20May%202026/Html%20files/Tagname.html");

        //enter UN
        driver.findElement(By.tagName("input")).sendKeys("abc");

        //enter pwd
        driver.findElement(By.tagName("input")).sendKeys("xyz");
    }
}
