package com.ebay.com.steps;

import com.ebay.com.pageObject.HomePage;
import com.ebay.com.pageObject.ResultsPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchStep{
HomePage homePage=new HomePage();
ResultsPage resultsPage=new ResultsPage();
    @When("^i enter the product as \"([^\"]*)\"$")
    public void i_enter_the_product_as(String product) throws Throwable {
        homePage.enterText(product);

    }

    @When("^I select \"([^\"]*)\" from all categories$")
    public void i_select_from_all_categories(String category) throws Throwable {

homePage.selectItem(category);
homePage.clickSearchButton();
    }



    @When("^I select any product$")
    public void i_select_any_product() throws Throwable {

    }

    @Then("^I should see selected product$")
    public void i_should_see_selected_product() throws Throwable {

    }


    @And("^I select min as (\\d+) max as (\\d+)$")
    public void iSelectMinAsMaxAs(String min, String max) {
        resultsPage.setMinAndMaxPrice(min,max);
        resultsPage.clickButton();
    }
}
