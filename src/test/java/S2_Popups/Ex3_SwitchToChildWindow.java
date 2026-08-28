package S2_Popups;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.ArrayList;
import java.util.Set;

public class Ex3_SwitchToChildWindow
{
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://skpatro.github.io/demo/links/");

        //click on NewTab button from main page
        driver.findElement(By.xpath("//input[@name='NewTab']")).click();
        Thread.sleep(5000);

        //get child window id
        Set<String> allIds = driver.getWindowHandles();     //[mainPageId, childWindowId]
        ArrayList<String> al=new ArrayList<>(allIds);      //[mainPageId(0), childWindowId(1)]
        String childWindowId=al.get(1);

        //switch to child
        driver.switchTo().window(childWindowId);      //String childChildWindowID

        //click on Training link from child window
        driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();

    }
}
