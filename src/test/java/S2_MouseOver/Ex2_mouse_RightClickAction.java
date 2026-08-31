package S2_MouseOver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ex2_mouse_RightClickAction
{
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com/");
        Thread.sleep(5000);

        //click on close icon
        driver.findElement(By.xpath("//span[@class='b3wTlE']")).click();
        Thread.sleep(2000);


        WebElement cart = driver.findElement(By.xpath("//span[text()='Cart']"));
        Actions act=new Actions(driver);

        //Apr1
//        act.moveToElement(cart).perform();
//        act.contextClick().perform();

        //Apr2:
//        act.moveToElement(cart).contextClick().perform();

//        Apr3
        act.contextClick(cart).perform();


    }
}
