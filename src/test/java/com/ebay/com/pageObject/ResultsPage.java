package com.ebay.com.pageObject;

import com.ebay.com.drivers.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class ResultsPage extends DriverFactory {
    @FindBy(id = "el-13")
    private WebElement MinimumPrice;

    @FindBy(id = "el-14")
    private WebElement MaximumPrice;
    @FindBy(id = "el_87")

    private WebElement SubmitButton;

    public void setMinAndMaxPrice(String min, String max) {
        MinimumPrice.sendKeys(min);
        MaximumPrice.sendKeys(max);


    }
    public void clickButton(){
        SubmitButton.click();
    }
}
