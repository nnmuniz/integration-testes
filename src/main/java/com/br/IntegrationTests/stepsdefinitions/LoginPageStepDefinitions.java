package com.br.IntegrationTests.stepsdefinitions;

import cucumber.api.java.en.Given;
import com.br.IntegrationTests.testBase.TestBase;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.testng.AssertJUnit.assertEquals;


public class LoginPageStepDefinitions extends TestBase {
    private int cantor = 0;

    @Given("^que o valor do contador eh (\\d+)$")
    public void queOValorDoContadorEh(int contadorInicial) throws Throwable {
        cantor = contadorInicial;
    }

    @When("^eu incrementar em (\\d+)$")
    public void euIncrementarEm(int incremento) throws Throwable {
        cantor = cantor + incremento;
    }

    @Then("^o valor do contador sera (\\d+)$")
    public void oValorDoContadorSera(int arg1) throws Throwable {
        assertEquals(arg1, cantor);
    }
}