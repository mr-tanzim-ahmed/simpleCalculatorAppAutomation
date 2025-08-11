package com.bng.calculator.bng.calculator;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TrigonometryOperationTest extends BaseTest {

    @Test
    public void sineTest() {
        driver.findElement(By.id("sine")).click();
        driver.findElement(By.id("btn_3")).click();
        driver.findElement(By.id("btn_0")).click();
        driver.findElement(By.id("equal")).click();
        takeScreenshot();
        String result = driver.findElement(By.id("formula")).getText().trim();
        System.out.println("Sine of 30 degrees is: " + result);
        Assert.assertEquals(result, "0.5", "Sine calculation is correct");
    }

    @Test
    public void cosineTest() {
        driver.findElement(By.id("cosine")).click();
        driver.findElement(By.id("btn_6")).click();
        driver.findElement(By.id("btn_0")).click();
        driver.findElement(By.id("equal")).click();
        takeScreenshot();
        String result = driver.findElement(By.id("formula")).getText().trim();
        System.out.println("Cosine of 60 degrees is: " + result);
        Assert.assertEquals(result, "0.5", "Cosine calculation is correct");
    }
    @Test
    public void tangentTest() {
        driver.findElement(By.id("tangent")).click();
        driver.findElement(By.id("btn_4")).click();
        driver.findElement(By.id("btn_5")).click();
        driver.findElement(By.id("equal")).click();
        takeScreenshot();
        String result = driver.findElement(By.id("formula")).getText().trim();
        System.out.println("Tangent of 45 degrees is: " + result);
        Assert.assertEquals(result, "1.0", "Tangent calculation is correct");
    }
}
