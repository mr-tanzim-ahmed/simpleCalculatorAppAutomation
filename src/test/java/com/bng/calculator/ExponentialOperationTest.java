package com.bng.calculator;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ExponentialOperationTest extends BaseTest{

    @Test
    public void E_toThePowerOf_X_Test() {
        driver.findElement(By.xpath("//android.widget.Button[@text=\"eˣ\"]")).click();
        driver.findElement(By.id("_0p_1")).click();
        driver.findElement(By.id("_0p_3")).click();
        driver.findElement(By.id("btn_7")).click();
        driver.findElement(By.id("parr")).click();
        driver.findElement(By.id("equal")).click();
        takeScreenshot();
        String result = driver.findElement(By.id("formula")).getText().trim();
        System.out.println("Result of e^0.7 : " + result);
        Assert.assertEquals(result, "2.0137527075", "Exponential calculation is correct");
        driver.findElement(By.id("btn_clear")).click();
    }
    @Test
    public void X_toThePowerOf_Y_Test() {
        driver.findElement(By.id("btn_5")).click();
        driver.findElement(By.xpath("//android.widget.Button[@text=\"xʸ\"]")).click();
        driver.findElement(By.id("btn_3")).click();
        driver.findElement(By.id("parr")).click();
        driver.findElement(By.id("equal")).click();
        takeScreenshot();
        String result = driver.findElement(By.id("formula")).getText().trim();
        System.out.println("Result of 5^3 : " + result);
        Assert.assertEquals(result, "125", "Power calculation is correct");
        driver.findElement(By.id("btn_clear")).click();
    }
    @Test
    public void X_inverse_Test() {

        driver.findElement(By.xpath("//android.widget.Button[@text=\"1/x\"]")).click();
        driver.findElement(By.id("btn_2")).click();
        driver.findElement(By.id("equal")).click();
        takeScreenshot();
        String result = driver.findElement(By.id("formula")).getText().trim();
        System.out.println("Result of 2^-1 : " + result);
        Assert.assertEquals(result, "0.5", "Inverse calculation is correct");
        driver.findElement(By.id("btn_clear")).click();
    }
    @Test
    public void X_square_Test() {
        driver.findElement(By.id("btn_4")).click();
        driver.findElement(By.xpath("//android.widget.Button[@text=\"x²\"]")).click();
        driver.findElement(By.id("equal")).click();
        takeScreenshot();
        String result = driver.findElement(By.id("formula")).getText().trim();
        System.out.println("Result of 4^2 : " + result);
        Assert.assertEquals(result, "16", "Square calculation is correct");
        driver.findElement(By.id("btn_clear")).click();
    }

}
