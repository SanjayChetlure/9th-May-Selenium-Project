package S2_Popups;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.ArrayList;
import java.util.Set;

public class Ex3_SwitchToMainPageFrom_ChildWindow2
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

        //switch to child
        driver.switchTo().window(al.get(1));      //String childChildWindowID

        //click on Training link from child window
        driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();
        Thread.sleep(2000);

        //switch to main page
        driver.switchTo().window(al.get(0));
        Thread.sleep(2000);

        //click on NewWindow button from main page
        driver.findElement(By.xpath("//input[@name='NewWindow']")).click();

        Set<String> allIds2 = driver.getWindowHandles();       //[mainPage, childWindow1, childWindow2]
        ArrayList<String> al2=new ArrayList<>(allIds2);         //[mainPage[0], childWindow1[1], childWindow2[2]]


        //switch to child window2
        driver.switchTo().window(al2.get(2));
        Thread.sleep(2000);

        driver.close();
    }
}
