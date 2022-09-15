package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static org.example.stepDefs.Hooks.driver;
import static org.testng.AssertJUnit.assertTrue;

public class P01_payment {
    public WebElement clickOnAddToCart() {
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[5]/div[3]/button")).click();
        return null;
    }

    public WebElement clickOnBagImage() {
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/header/div/div[3]/a[4]")).click();
        return null;
    }

    public WebElement click_on_proceed_toCheckout_button() {
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/header/div/div[3]/div[2]/div[2]/button")).click();
        return null;
    }

    public WebElement clickPlaceOrder() {
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/button")).click();
        return null;
    }

    public WebElement clickOnSelectBtn() {

        WebElement testDropDown = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/select"));
        Select dropdown = new Select(testDropDown);
        dropdown.selectByIndex(5);

        return null;
    }

    public WebElement cLickAgree() {
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/input")).click();

        return null;
    }

    public WebElement clickProceedBtn() {
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/button")).click();
        return null;
    }

    public boolean validateSuccessPayment() {
        boolean result = false;
        if (driver.getCurrentUrl().equalsIgnoreCase("https://rahulshettyacademy.com/seleniumPractise/#/country")) {
            result = true;
        }

        return result;
    }
}
