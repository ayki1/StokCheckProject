package Tasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day4_T5_checkboxes {
    public static void main(String[] args) throws InterruptedException {/*
        Practice: Checkboxes
        1. Go to http://practice.cydeo.com/checkboxes
        2. Confirm checkbox #1 is NOT selected by default
        3. Confirm checkbox #2 is SELECTED by default.
        4. Click checkbox #1 to select it.
        5. Click checkbox #2 to deselect it.
        6. Confirm checkbox #1 is SELECTED.
        7. Confirm checkbox #2 is NOT selected. */

        //WebDriver driver = WebDriverFactory.getDriver("chrome");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/checkboxes");

        //We have to locate checkboxes
        WebElement checkbox1 = driver.findElement(By.xpath("//input[@name='checkbox1']"));
        WebElement checkbox2 = driver.findElement(By.xpath("//input[@name='checkbox2']"));

        //2. Confirm checkbox #1 is NOT selected by default.
        System.out.println("checkbox1.isSelected(), expecting false = " + checkbox1.isSelected());

        //3. Confirm checkbox #2 is SELECTED by default.
        System.out.println("checkbox2.isSelected(), expecting true = " + checkbox2.isSelected());

        //4. Click checkbox #1 to select it.
        Thread.sleep(2000);
        checkbox1.click();

        //5. Click checkbox #2 to deselect it.
        Thread.sleep(2000);
        checkbox2.click();

        //6. Confirm checkbox #1 is SELECTED.
        System.out.println("checkbox1.isSelected(), expecting true = " + checkbox1.isSelected());

        //7. Confirm checkbox #2 is NOT selected.
        System.out.println("checkbox2.isSelected(), expecting false = " + checkbox2.isSelected());

//        if(checkbox1.isSelected()){
//            System.out.println("verification passed");
//        }else{
//            System.out.println("verification fail");
//        }
//        //   7. Confirm checkbox #2 is NOT selected.
//
//        if(!checkbox2.isSelected()){
//            System.out.println("verification passed");
//        }else{
//            System.out.println("verification fail");
//        }

        System.out.println("the end");


    }
}
