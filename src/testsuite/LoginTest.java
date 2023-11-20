package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

/**
 * Create the package ‘testsuite’ and create the
 * following classes inside the ‘testsuite’ package.
 * 1. LoginTest
 * 2. ForgotPasswordTest
 * Write down the following test into ‘LoginTest’ class
 * 1. userSholdLoginSuccessfullyWithValidCredentials
 * * Enter “Admin” username
 * * Enter “admin123 password
 * * Click on ‘LOGIN’ button
 * * Verify the ‘Dashboard’ text is display
 * Created by Sandip Patel
 */

public class LoginTest extends BaseTest {
    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    // Individual open and close
    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    // 1. userShouldLoginSuccessfullyWithValidCredentials
    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        // * Enter “Admin” username
        driver.findElement(By.name("username")).sendKeys("Admin");
        //  Enter “admin123 password
        driver.findElement(By.name("password")).sendKeys("admin123");
        // Click on ‘LOGIN’ button
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        // Verify the ‘Dashboard’ text is display
        String expectedDisplay = "Dashboard";
        String actualDisplay = driver.findElement(By.xpath("//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")).getText();
        Assert.assertEquals(expectedDisplay, actualDisplay);
    }

    // Individual open and close
    @After
    public void tearDown() {
        closeBrowser();
    }

}
