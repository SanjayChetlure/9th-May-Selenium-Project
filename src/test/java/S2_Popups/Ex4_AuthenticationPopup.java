package S2_Popups;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.ArrayList;
import java.util.Set;

public class Ex4_AuthenticationPopup
{
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
//        driver.get("https://the-internet.herokuapp.com/basic_auth");
//        url=  https://UN:PWD@remianingURL

        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
    }
}
