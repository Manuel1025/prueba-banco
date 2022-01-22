package com.indra.steps_definitions;

import com.indra.actions.DespegarActions;
import com.indra.models.DespegarModels;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class DespegarSteps {
    @Managed
    WebDriver driver;

    DespegarActions despegarActions = new DespegarActions(driver);
    @Given("^que el usuario ingresa a la pagina$")
    public void queElUsuarioIngresaALaPagina() {
        despegarActions.open();

    }


    @When("^diligencia el formulrio de vuelo$")
    public void diligenciaElFormulrioDeVuelo(List<DespegarModels> despegarModels) {
        despegarActions.llenarFormuilario(despegarModels.get(0));

    }

    @Then("^deberia poder escoger un vuelo$")
    public void deberiaPoderEscogerUnVuelo() {
        despegarActions.verVuelos();

    }










}
