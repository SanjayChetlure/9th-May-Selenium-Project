package S1_WebDriver_Methods;
import org.jspecify.annotations.Nullable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex5_getCurrentURL
{
    public static void main(String[] args)
    {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");

        String url = driver.getCurrentUrl();
        System.out.println(url);

        System.out.println("---");

        System.out.println(driver.getCurrentUrl());
    }
}
