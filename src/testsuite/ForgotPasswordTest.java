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
 * Write down the following test into
 * ‘ForgotPasswordTest’ class
 * 1. userShouldNavigateToForgotPasswordPageSuccessfully
 * * click on the ‘Forgot your password’ link
 * * Verify the text ‘Reset Password’
 * Created by Sandip Patel
 */

public class ForgotPasswordTest extends BaseTest {
    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    // Individual open and close
    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    // 1 userShouldNavigateToForgotPasswordPageSuccessfully
    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully() {
        // click on the ‘Forgot your password’ link
        driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']")).click();
        // Verify the text ‘Reset Password’
        String expectedText = "Reset Password";
        String actualText = driver.findElement(By.xpath("//h6[@class='oxd-text oxd-text--h6 orangehrm-forgot-password-title']")).getText();
        Assert.assertEquals(expectedText, actualText);
    }

    // Individual open and close
    @After
    public void tearDown() {
        closeBrowser();
    }
}