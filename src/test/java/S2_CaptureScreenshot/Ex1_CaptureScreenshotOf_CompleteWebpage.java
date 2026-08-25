package S2_CaptureScreenshot;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import java.io.File;
import java.io.IOException;

public class Ex1_CaptureScreenshotOf_CompleteWebpage
{
    public static void main(String[] args) throws IOException {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");

        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        File dest=new File("D:\\Java\\Batches\\2026\\9th May 2026\\Screenshots\\Sample1.png");

        FileHandler.copy(src,dest);
    }
}
