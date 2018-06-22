package com.ebay.com.pageObject;

import com.ebay.com.drivers.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HomePage extends DriverFactory {
    @FindBy(id = "gh-ac")
    private WebElement searchBox;
    @FindBy(id = "gh-cat")
    private WebElement allCategories;
    @FindBy(id = "gh-btn")
    private WebElement searchButton;

public void enterText(String name){
    searchBox.sendKeys(name);
}
public void selectItem (String category){
    new Select(allCategories).selectByVisibleText(category);
}
public void clickSearchButton(){
    searchButton.click();

}
}
