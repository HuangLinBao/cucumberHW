package cucumberHW;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.*;

public class StepDefinitions {
    @Given("the price of a {string} is {int}")
    public void thePriceOfAIs(String arg0, int arg1) {
        System.out.println("The price of "+ arg0 +" is "+ arg1);
        return;
    }

    @When("I checkout {int} {string}")
    public void iCheckout(int arg0, String arg1) {
        System.out.println("Checkout " + arg0 +" "+ arg1);
    }

    @Then("the total price should be {int}")
    public void theTotalPriceShouldBe(int arg0) {
        System.out.println("Total is: "+ arg0);
    }
}
