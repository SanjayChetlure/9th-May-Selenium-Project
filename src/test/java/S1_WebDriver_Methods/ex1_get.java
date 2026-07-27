package S1_WebDriver_Methods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex1_get
{
    public static void main(String[] args) throws InterruptedException
    {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        Thread.sleep(10000);                              //className.methodName(timeInMiliSec)
        driver.get("https://www.google.com/");
    }
}
