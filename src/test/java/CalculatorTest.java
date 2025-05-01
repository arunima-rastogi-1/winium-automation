import org.openqa.selenium.By;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;

import java.io.IOException;
import java.net.URL;

public class CalculatorTest {
    public static void main(String[] args) throws IOException, InterruptedException {
        DesktopOptions options = new DesktopOptions();
        options.setApplicationPath("C:\\Windows\\System32\\calc.exe");


        WiniumDriver driver = new WiniumDriver(new URL("http://localhost:9998"), options);


        driver.findElement(By.name("Seven")).click();
        driver.findElement(By.name("Plus")).click();
        driver.findElement(By.name("Five")).click();
        driver.findElement(By.name("Equals")).click();


        String result = driver.findElement(By.id("CalculatorResults")).getAttribute("Name");
        System.out.println("Result is: " + result);


    }
}
