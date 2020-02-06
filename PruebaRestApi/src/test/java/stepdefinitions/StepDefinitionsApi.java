package stepdefinitions;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.rest.abiities.CallAnApi;
import task.ConsultFilm;
import util.Constantes;
import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;
import static org.hamcrest.Matchers.equalTo;

public class StepDefinitionsApi {

	@Before
	public void setUp() {
		OnStage.setTheStage(new OnlineCast());
		theActorCalled("Semillero");
	}

	@Given("^El (\\d+) en una base de datos$")
	public void idBase(int id) {

		theActorInTheSpotlight().whoCan(CallAnApi.at(Constantes.BASE_URL));
		theActorInTheSpotlight().attemptsTo(ConsultFilm.consultar(String.valueOf(id) + Constantes.SLASH));
	}

	@Then("^Valido \"([^\"]*)\" y (\\d+)$")
	public void valido(String name, int id) {

		theActorInTheSpotlight().should(seeThatResponse(response -> response.statusCode(200)));
		theActorInTheSpotlight().should(seeThatResponse(response -> response.body("episode_id", equalTo(id))));
		theActorInTheSpotlight().should(seeThatResponse(response -> response.body("title", equalTo(name))));

	}

}
