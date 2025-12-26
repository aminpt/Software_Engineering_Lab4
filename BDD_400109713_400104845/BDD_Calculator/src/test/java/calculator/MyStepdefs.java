package calculator;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.calculator.Calculator;
import org.junit.Assert;

public class MyStepdefs {
    private Calculator calculator;
    private int value1;
    private int value2;

    @Given("^Two input values, (-?\\d+) and (-?\\d+)$")
    public void twoInputValues(int arg0, int arg1) {
        calculator = new Calculator();
        value1 = arg0;
        value2 = arg1;
    }

    @When("^I calculate the square root of division$")
    public void iCalculateTheSquareRootOfDivision() {
        calculator.calculateRootOfDivision(value1, value2);
    }

    @Then("^I expect the result (-?\\d+)$")
    public void iExpectTheResult(int expectedResult) {
        Assert.assertEquals(expectedResult, calculator.getResult());
    }
}
