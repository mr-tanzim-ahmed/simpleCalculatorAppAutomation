package com.bng.calculator;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LogarithmicTest extends BaseTest{
    @Test
    public void Ln_Test() {
        driver.findElement(By.xpath("//android.widget.Button[@text=\"ln\"]")).click();
        driver.findElement(By.xpath("//android.widget.Button[@text=\"eˣ\"]")).click();
        driver.findElement(By.id("btn_2")).click();
        driver.findElement(By.id("parr")).click();
        driver.findElement(By.id("parr")).click();
        driver.findElement(By.id("equal")).click();
        takeScreenshot();
        String result = driver.findElement(By.id("formula")).getText().trim();
        System.out.println("Result of ln(e^2) : " + result);
        Assert.assertEquals(result, "2", "Logarithm calculation is correct");
        driver.findElement(By.id("btn_clear")).click();
    }
    @Test
    public void Log_Test() {
        driver.findElement(By.xpath("//android.widget.Button[@text=\"log\"]")).click();
        driver.findElement(By.id("btn_1")).click();
        driver.findElement(By.id("parr")).click();
        driver.findElement(By.id("equal")).click();
        takeScreenshot();
        String result = driver.findElement(By.id("formula")).getText().trim();
        System.out.println("Result of log(1) : " + result);
        Assert.assertEquals(result, "0", "Logarithm calculation is correct");
        driver.findElement(By.id("btn_clear")).click();
    }
}
