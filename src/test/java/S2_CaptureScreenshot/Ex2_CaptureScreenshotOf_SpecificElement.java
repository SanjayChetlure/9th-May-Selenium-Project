package S2_CaptureScreenshot;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class Ex2_CaptureScreenshotOf_SpecificElement
{
    public static void main(String[] args) throws IOException {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");

        File src = driver.findElement(By.xpath("//button[text()='START']")).getScreenshotAs(OutputType.FILE);
        System.out.println(src);

        File dest=new File("D:\\Java\\Batches\\2026\\9th May 2026\\Screenshots\\abc.png");

        FileHandler.copy(src,dest);          //className.methodName(srcImageAddress,desImgAddress)

    }
}
