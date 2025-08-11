package com.bng.calculator.bng.calculator;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BasicOperation extends BaseTest{

    @Test
    public void additionTest(){
        driver.findElement(By.id("btn_5")).click();
        driver.findElement(By.id("plus")).click();
        driver.findElement(By.id("btn_3")).click();
        driver.findElement(By.id("equal")).click();
        takeScreenshot();
        String result = driver.findElement(By.id("formula")).getText().trim().replaceAll(",","");
        System.out.println("Result of addition : "+result);
        Assert.assertEquals(result, "8","Addition is correct");
    }
    @Test
    public void minusTest(){
        driver.findElement(By.id("btn_6")).click();
        driver.findElement(By.id("btn_4")).click();
        driver.findElement(By.id("btn_2")).click();
        driver.findElement(By.id("_0p_1")).click();

        driver.findElement(By.id("minus")).click();
        takeScreenshot();
        driver.findElement(By.id("btn_1")).click();
        driver.findElement(By.id("btn_4")).click();
        driver.findElement(By.id("btn_2")).click();
        driver.findElement(By.id("_0p_1")).click();
        driver.findElement(By.id("equal")).click();
        takeScreenshot();
        String result = driver.findElement(By.id("formula")).getText().trim().replaceAll(",","");
        System.out.println("Minus result is : "+result);
        Assert.assertEquals(result,"5000", "Substraction is correct");
    }
    @Test
    public void multiplicationTest(){
        driver.findElement(By.id("btn_2")).click();
        driver.findElement(By.id("btn_5")).click();
        driver.findElement(By.id("multi")).click();
        takeScreenshot();
        driver.findElement(By.id("btn_1")).click();
        driver.findElement(By.id("btn_5")).click();
        driver.findElement(By.id("equal")).click();
        takeScreenshot();
        String result = driver.findElement(By.id("formula")).getText().trim().replaceAll(",","");
        System.out.println("Multiplication result is : "+result);
        Assert.assertEquals(result,"375","Multiplication is correct");
    }
    @Test
    public void divisionTest(){
        driver.findElement(By.id("btn_9")).click();
        driver.findElement(By.id("_0p_1")).click();
        driver.findElement(By.id("divi")).click();
        takeScreenshot();
        driver.findElement(By.id("btn_1")).click();
        driver.findElement(By.id("btn_5")).click();
        driver.findElement(By.id("equal")).click();
        takeScreenshot();
        String result = driver.findElement(By.id("formula")).getText().trim().replaceAll(",","");
        System.out.println("Division result is : "+result);
        Assert.assertEquals(result,"6","Division is correct");
    }

    @Test
    public void rootTest(){
        driver.findElement(By.xpath("//android.widget.Button[@text=\"√\"]")).click();
        driver.findElement(By.id("btn_2")).click();
        driver.findElement(By.id("btn_5")).click();
        driver.findElement(By.id("parr")).click();
        takeScreenshot();
        String result = driver.findElement(By.id("formula")).getText().trim();
        float floatValue = Float.valueOf(result);
        String rootResult = String.format("%.2f", floatValue);
        System.out.println("Root result : "+rootResult);

        Assert.assertEquals(rootResult, "5.00", "Root is correct");
    }

}
