package S2_Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ex4_getSelectedOptionFrom_SingleSelectableListbox
{
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");

        WebElement country = driver.findElement(By.xpath("//select[@id='country']"));
        Select s=new Select(country);

        WebElement s1 = s.getFirstSelectedOption();
        String text = s1.getText();
        System.out.println(text);

        System.out.println("---");

        String text2 = s.getFirstSelectedOption().getText();
        System.out.println(text2);

        System.out.println("---");

        System.out.println(s.getFirstSelectedOption().getText());

    }
}
