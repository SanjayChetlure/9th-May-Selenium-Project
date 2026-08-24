package S2_Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Ex6_getAllOptionFrom_Listbox
{
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");

        WebElement colors = driver.findElement(By.xpath("//select[@id='colors']"));
        Select s=new Select(colors);

        List<WebElement> allOptions = s.getOptions();

        for(WebElement s1:allOptions)
        {
            System.out.println(s1.getText());
        }

    }
}
