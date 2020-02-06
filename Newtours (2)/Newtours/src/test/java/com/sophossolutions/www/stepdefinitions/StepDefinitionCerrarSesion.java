package com.sophossolutions.www.stepdefinitions;

// Importaciones Librería
import org.openqa.selenium.WebDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Managed;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotVisible;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

// Importaciones Proyecto
import www.sophossolutions.www.tasks.AccederEnlace;
import www.sophossolutions.www.tasks.IngresarCuenta;
import www.sophossolutions.www.tasks.NavegarASitio;
import com.sophossolutions.www.userinterfaces.PaginaCatalogo;

// Clase
public class StepDefinitionCerrarSesion {

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

	@Given("^He iniciado sesion en la aplicacion, con cuenta de usuario '(.*)' y clave '(.*)'$")
	public void iniciarSesion(String usuario, String clave) {
		actor.wasAbleTo(NavegarASitio.paginaInicio(), AccederEnlace.irA(PaginaCatalogo.ENLACE_SIGN_IN),
				IngresarCuenta.deUsuario(usuario, clave));
	}

	@When("^Utilice la opcion de cerrar sesion$")
	public void cerrarSesion() {
		actor.attemptsTo(Click.on(PaginaCatalogo.ENLACE_SIGN_OUT));
	}

	@Then("^Debe cargar la pagina del catalogo, sin el mensaje de bienvenida$")
	public void validarSesionCerrada() {
		actor.should(seeThat(the(PaginaCatalogo.IMAGEN_CATALOGO), isVisible()),
				seeThat(the(PaginaCatalogo.BIENVENIDA), isNotVisible()),
				seeThat(the(PaginaCatalogo.ENLACE_SIGN_IN), isVisible()));
	}

}
