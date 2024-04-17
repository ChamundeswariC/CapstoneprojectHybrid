package com.metlife.testsuites;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.Base64;
import java.util.Properties;


public class Demo1
{
    public static void main(String[] args) throws IOException, InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));

        driver.get("https://d5g00000kmznieax-dev-ed.develop.lightning.force.com/");

        driver.findElement(By.id("username")).sendKeys("ghadgemangesh20@gmail.com");
        driver.findElement(By.id("password")).sendKeys("M@ng2359");
        driver.findElement(By.name("Login")).click();


       /* //Properties file
        FileInputStream fis = new FileInputStream("C:\\Users\\ukumar35\\IdeaProjects\\Scheduler_Capstone\\src\\test\\resources\\data.properties");
        Properties p = new Properties();
        p.load(fis);

        //Encrypting the password, so that who so ever running the script will not see the sensitive information
        String encrypt = p.getProperty("EncryptedPassword");
        byte[] decrypt = Base64.getDecoder().decode(encrypt);
        String decrypted = new String(decrypt, StandardCharsets.UTF_8);
        System.out.println(decrypted);
        driver.findElement(By.id("password")).sendKeys(decrypted);
        driver.findElement(By.name("Login")).click();*/

        //switching to lightning experience, if the browser launches to classic version
        try {
            driver.findElement(By.xpath("//a[@class='switch-to-lightning']")).click();
            System.out.println("switching to Lightning experience!");
        } catch (Exception e) {
            System.out.println("Lightning experience is directly launching!");
        }


        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
        driver.findElement(By.xpath("(//button[@class='slds-button'])[2]")).click();
        driver.findElement(By.xpath("//input[@class='slds-input']")).sendKeys("Salesforce Scheduler");
        driver.findElement(By.xpath("(//p[@class='slds-truncate'])[1]")).click();
        driver.findElement(By.xpath("//button[@title='Schedule a Service Appointment']")).click();
        WebElement element = driver.findElement(By.xpath("//input[@class='slds-combobox__input slds-input']"));
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("arguments[0].click();", element);
        driver.findElement(By.xpath("//span[@title='Ajay']")).click();
        WebElement el2 = driver.findElement(By.xpath("(//*[contains(text(),'Next')])[2]"));
        js.executeScript("arguments[0].click();", el2);
        WebElement el4 = driver.findElement(By.xpath("//*[contains(text(),'General Consult')]"));
        js.executeScript("arguments[0].click();", el4);
        WebElement el3 = driver.findElement(By.xpath("(//*[contains(text(),'Next')])[2]"));
        js.executeScript("arguments[0].click();", el3);
        WebElement el5 = driver.findElement(By.xpath("//*[contains(text(),'In a Video Call')]"));
        js.executeScript("arguments[0].click();", el5);
        WebElement el6 = driver.findElement(By.xpath("(//*[contains(text(),'Next')])[2]"));
        js.executeScript("arguments[0].click();", el6);
        WebElement el7 = driver.findElement(By.xpath("(//*[contains(text(),'Next')])[2]"));
        js.executeScript("arguments[0].click();", el7);
        System.out.println(driver.findElement(By.xpath("//ul[@class='errorsList']")).getText());
    }
}
/*
                Actions copy paste cut
            Actions act = new Actions(driver);
            act.moveToElement(txtBox1).doubleClick().build().perform();
                    txtBox1.sendKeys(Keys.chord(Keys.CONTROL, "x"));
                    txtBox1.sendKeys(Keys.chord(Keys.CONTROL, "c"));
                    txtBox1.sendKeys(Keys.chord(Keys.CONTROL, "v"));

*/


//            driver.findElement(By.xpath("(//div[@class='slds-app-launcher__tile-body slds-truncate'])[11]")).click();


       /* int maxAttempts = 3; // Maximum number of times you want to retry

        int attempt = 1;
        while (attempt <= maxAttempts) {
            try {
                WebElement element = wait.until(ExpectedConditions.elementToBeClickable(elementLocator));
                element.click(); // Click the element once it becomes clickable

                elementClickable = true; // Set the flag to indicate it was clicked

                break; // Break the loop since the action was successful

            } catch (Exception e) {
                // Not clickable, maybe retry?

                attempt++; // Increment the attempt count

            }
    }*/

