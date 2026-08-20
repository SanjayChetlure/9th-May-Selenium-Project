package S2_Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ex1_SelectOption1_From_SingleSelectableListbox
{
    public static void main(String[] args)
    {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");

        //1: identify the listbox
        WebElement country = driver.findElement(By.xpath("//select[@id='country']"));

        //2: Create an object of select class with WebElement obj as input
        Select s=new Select(country);

        //3: call select class methods
//        s.selectByVisibleText("Japan");            //String text
//        s.selectByValue("india");                 //String value
        s.selectByIndex(7);                         //int index

    }
}
