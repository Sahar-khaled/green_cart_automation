package org.example.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P01_payment;

public class D01_paymentStepDef extends P01_payment {
    @Given("user link to the url")
    public void user_link_to_the_url() {

    }
    @When("user click on add to cart button")
    public void user_click_on_add_to_cart_button() {
      clickOnAddToCart();
    }
    @When("click on bag image")
    public void click_on_bag_image() {
        clickOnBagImage();
    }
    @When("Click on proceed to checkout and navigate to green cart")
    public void click_on_proceed_to_checkout_and_navigate_to_green_cart() {
     click_on_proceed_toCheckout_button();
    }
    @When("click on place order button and navigate to choose country page")
    public void click_on_place_order_button_and_navigate_to_choose_country_page() {
     clickPlaceOrder();
    }
    @When("click on select button")
    public void click_on_select_button() {
    clickOnSelectBtn();
    }
    @When("agree to the terms and conditions")
    public void agree_to_the_terms_and_conditions() {
       cLickAgree();
    }
    @When("click on proceed button")
    public void click_on_proceed_button() {
      clickProceedBtn();
    }
    @Then("Validate that the user bought successfully.")
    public void validate_that_the_user_bought_successfully() {
        validateSuccessPayment();
    }


}
