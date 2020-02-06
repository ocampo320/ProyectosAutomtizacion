package com.sophossolutions.www.stepdefinitions;

// Importaciones Librerías
import org.openqa.selenium.WebDriver;

import com.sophossolutions.www.questions.QuestionTexto;
import com.sophossolutions.www.userinterfaces.PaginaCatalogo;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;
import static org.hamcrest.Matchers.equalTo;

// Importaciones Proyecto
import www.sophossolutions.www.tasks.AccederEnlace;
import www.sophossolutions.www.tasks.IngresarCuenta;
import www.sophossolutions.www.tasks.NavegarASitio;

public class StepDefinitionIniciarSesion {

	// Atributos
	@Managed(driver = "chrome")
	private WebDriver driver;
	private Actor actor = Actor.named("Christian");

	// Métodos
	@Before
	public void setUp() {
		driver.manage().window().maximize();
		actor.can(BrowseTheWeb.with(driver));
	}

	@Given("^He ingresado a la pagina de inicio de sesion de JPetStore$")
	public void ingresarPaginaInicioSesion() {
		actor.wasAbleTo(NavegarASitio.paginaInicio(), AccederEnlace.irA(PaginaCatalogo.ENLACE_SIGN_IN));
	}

	@When("^Ingreso la cuenta de usuario '(.*)' y la clave '(.*)'$")
	public void ingresarCuentaUsuario(String usuario, String clave) {
		actor.attemptsTo(IngresarCuenta.deUsuario(usuario, clave));
	}

	@Then("^Debe cargar la pagina del catalogo con la sesion iniciada, mostrando el nombre de '(.*)'$")
	public void validarSesionIniciada(String nombre) {
		final String bienvenida = String.format("Welcome %s!", nombre);
		actor.should(seeThat(the(PaginaCatalogo.IMAGEN_CATALOGO), isVisible()),
				seeThat(QuestionTexto.usuarioSesion(), equalTo(bienvenida)));
	}

}
