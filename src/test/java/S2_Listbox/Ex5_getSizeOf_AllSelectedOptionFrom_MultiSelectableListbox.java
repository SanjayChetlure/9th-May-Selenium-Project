package S2_Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Ex5_getSizeOf_AllSelectedOptionFrom_MultiSelectableListbox
{
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");

        WebElement colors = driver.findElement(By.xpath("//select[@id='colors']"));
        Select s=new Select(colors);

        s.selectByIndex(3);
        s.selectByIndex(2);
        s.selectByIndex(1);

//        List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
//        System.out.println(allSelectedOptions.size());

        System.out.println(s.getAllSelectedOptions().size());

    }
}
