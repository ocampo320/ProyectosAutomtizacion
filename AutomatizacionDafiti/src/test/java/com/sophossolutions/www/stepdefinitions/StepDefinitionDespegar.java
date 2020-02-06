package com.sophossolutions.www.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

import org.openqa.selenium.WebDriver;

import com.sophossolutions.www.question.ValorVuelo;
import com.sophossolutions.www.task.BuscarVuelo;
import com.sophossolutions.www.task.ConfirmarVuelo;
import com.sophossolutions.www.userInterface.Confirmacionreserva;
import com.sophossolutions.www.userInterface.InicioDespegar;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;

public class StepDefinitionDespegar {

	//@Managed(driver = "chrome")
	//private WebDriver web;
	private InicioDespegar inicio;

	@Given("^Necesisto comprar un vuelo$")
	public void comprarvuelo() {
		theActorInTheSpotlight().wasAbleTo(Open.browserOn(inicio));
	}

	@When("^Vuelo entre (.*) y (.*)$")
	public void entreCiudades(String origen, String destino) {

		theActorInTheSpotlight().attemptsTo(BuscarVuelo.seleccionarVuelo(origen, destino, "2/2/2020", "7/2/2020"),
				ConfirmarVuelo.with());

	}

	@Then("^Valido el valor del vuelo$")
	public void validarValorVuelo() {

		theActorInTheSpotlight().should(seeThat(ValorVuelo.is(Confirmacionreserva.PRECIO), equalTo("179.729")));

	}

}
