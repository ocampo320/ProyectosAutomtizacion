package com.sophossolutions.www.stepdefinitions;

//Importaciones Proyecto
import www.sophossolutions.www.tasks.NavegarASitio;
import com.sophossolutions.www.userinterfaces.PaginaCatalogo;

//Importaciones Librerías
import org.openqa.selenium.WebDriver;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

// Clase
public class StepDefinitionIngresarAplicacion {

	// Atributos
	@Managed(driver = "chrome")
	private WebDriver driver;
	private Actor actor = Actor.named("Christian");

	// Métodos
	@Before
	public void setUp() {
		driver.manage().window().maximize();
	}

	@Given("^Tengo acceso a Internet$")
	public void validarAccesoInternet() {
		actor.can(BrowseTheWeb.with(driver));
	}

	@When("^Acceda a la pagina de JPetStore a traves del navegador$")
	public void accederPaginaAplicacion() {
		actor.attemptsTo(NavegarASitio.paginaInicio());
	}

	@Then("^Debe cargar la pagina de catalogo de la aplicacion$")
	public void validarPaginaCatalago() {
		actor.should(seeThat(the(PaginaCatalogo.IMAGEN_CATALOGO), isVisible()));
	}

}
