package Tasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2_T1CydeoVerifications {
    public static void main(String[] args) {
        /*TC #1: Cydeo practice tool verifications
        1. Open Chrome browser
        2. Go to https://practice.cydeo.com
        3. Verify URL contains
        Expected: cydeo
        4. Verify title:
        Expected: Practice  */

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // 2. Go to https://practice.cydeo.com
        driver.get("https://practice.cydeo.com");
        //driver.navigate().to("https://practice.cydeo.com");


        //3. Verify URL contains
        //Expected: cydeo
        String expectedURL = "cydeo";
        String actualURL = driver.getCurrentUrl();
        System.out.println("driver.getCurrentUrl() = "
                + driver.getCurrentUrl());

        if (actualURL.contains(expectedURL)){
            System.out.println("URL verification PASSED!");
        }else{
            System.out.println("URL verification FAILED!!!");
        }

        // 4. Verify title:
        //Expected: Practice
        String expectedTitle = "Practice";
        String actualTitle = driver.getTitle();
        System.out.println("driver.getTitle() = " + driver.getTitle());

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title verification PASSED");
        }else {
            System.out.println("Title verification FAILED");
        }

        driver.quit();
        System.out.println("THE END");


    }
}
