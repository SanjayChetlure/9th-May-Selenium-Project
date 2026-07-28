package S1_WebDriver_Methods;
import org.jspecify.annotations.Nullable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex3_quit
{
    public static void main(String[] args) throws InterruptedException
    {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");
        Thread.sleep(5000);

//        driver.quit();


         String title = driver.getTitle();
         System.out.println(title);

        System.out.println("-----");

        System.out.println(driver.getTitle());



    }
}
