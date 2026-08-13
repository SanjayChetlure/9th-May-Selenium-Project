package S1_WebElement_Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex9_isDisplayed
{
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");
        Thread.sleep(2000);

        boolean result=false;

        try
        {
            result = driver.findElement(By.xpath("//a[text()='Home']")).isDisplayed();
        }
        catch (NoSuchElementException e)
        {
            System.out.println("NoSuchElement Exception Handled");
        }

        System.out.println(result);

        if (result)
        {
            System.out.println("Element Present");
        }
        else
        {
            System.out.println("Element not present");
        }
    }
}
