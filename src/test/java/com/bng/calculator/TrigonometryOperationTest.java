package com.bng.calculator;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TrigonometryOperationTest extends BaseTest {

    @Test
    public void sineTest() {
        driver.findElement(By.xpath("//android.widget.Button[@text=\"sin\"]")).click();
        driver.findElement(By.id("btn_3")).click();
        driver.findElement(By.id("_0p_1")).click();
        driver.findElement(By.id("equal")).click();
        takeScreenshot();
        String result = driver.findElement(By.id("formula")).getText().trim();
        System.out.println("Sine of 30 degrees is: " + result);
        Assert.assertEquals(result, "0.5", "Sine calculation is correct");
        driver.findElement(By.id("btn_clear")).click();
    }

    @Test(priority = 0)
    public void cosineTest() {
        driver.findElement(By.xpath("//android.widget.Button[@text=\"cos\"]")).click();
        driver.findElement(By.id("btn_6")).click();
        driver.findElement(By.id("_0p_1")).click();
        driver.findElement(By.id("equal")).click();
        takeScreenshot();
        String result = driver.findElement(By.id("formula")).getText().trim();
        System.out.println("Cosine of 60 degrees is: " + result);
        Assert.assertEquals(result, "0.5", "Cosine calculation is correct");
        driver.findElement(By.id("btn_clear")).click();
    }

    @Test(priority = 1)
    public void tangentTest() {
        driver.findElement(By.xpath("//android.widget.Button[@text=\"tan\"]")).click();
        driver.findElement(By.id("btn_4")).click();
        driver.findElement(By.id("btn_5")).click();
        driver.findElement(By.id("equal")).click();
        takeScreenshot();
        String result = driver.findElement(By.id("formula")).getText().trim();
        System.out.println("Tangent of 45 degrees is: " + result);
        Assert.assertEquals(result, "1", "Tangent calculation is correct");
        driver.findElement(By.id("btn_clear")).click();
    }

    @Test(priority = 2)
    public void paiTest() {
        driver.findElement(By.xpath("//android.widget.Button[@text=\"π\"]")).click();
        takeScreenshot();
        String result = driver.findElement(By.id("result")).getText().trim();
        System.out.println("Value of Pi is: " + result);
        Assert.assertEquals(result, "3.1415926536", "Pi value is correct");
        driver.findElement(By.id("btn_clear")).click();
    }
}
