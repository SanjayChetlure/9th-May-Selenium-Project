package S1_WebDriver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex8_fullScreen
{
    public static void main(String[] args) throws InterruptedException
    {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");

        Thread.sleep(3000);

        driver.manage().window().fullscreen();

    }
}
