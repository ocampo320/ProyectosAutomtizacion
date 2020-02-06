package com.sophossolutions.www.stepdefinitions.api;

import static com.sophossolutions.www.util.Constantes.SLASH;
import static com.sophossolutions.www.util.Constantes.URL_BASE;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;
import static org.hamcrest.Matchers.equalTo;

import com.sophossolutions.www.task.ConsultarPelicula;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.rest.abiities.CallAnApi;

public class StepDefinitionSwapi {

	@Before
	public void setUp() {
		OnStage.setTheStage(new OnlineCast());
		theActorCalled("Semillero");
	}

	@Given("^El (\\d+) en una base de datos$")
	public void buscarIdServicio(int id) {
		theActorInTheSpotlight().whoCan(CallAnApi.at(URL_BASE));
		theActorInTheSpotlight().attemptsTo(ConsultarPelicula.consultar(id + SLASH));
	}

	@Then("^valido \"([^\"]*)\" y (\\d+)$")
	public void validarPelicula(String titulo, int episodio) {
		theActorInTheSpotlight().should(seeThatResponse(response -> response.statusCode(200)));
		theActorInTheSpotlight().should(seeThatResponse(response -> response.body("episode_id", equalTo(episodio))));
		theActorInTheSpotlight().should(seeThatResponse(response -> response.body("title", equalTo(titulo))));
	}

}
