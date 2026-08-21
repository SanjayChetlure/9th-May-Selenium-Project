package S2_Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ex2_DeSelectOption_From_MultiSelectableListbox1
{
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");

        WebElement colors = driver.findElement(By.xpath("//select[@id='colors']"));
        Select s=new Select(colors);

        s.selectByIndex(0);
        s.selectByIndex(1);
        s.selectByIndex(2);
        s.selectByIndex(3);

        Thread.sleep(2000);

        s.deselectByIndex(1);
        s.deselectByVisibleText("Green");
        s.deselectByValue("yellow");

    }
}
