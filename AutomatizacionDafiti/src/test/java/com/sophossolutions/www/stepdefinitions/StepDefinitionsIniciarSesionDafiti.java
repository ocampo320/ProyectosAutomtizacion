package com.sophossolutions.www.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

import org.openqa.selenium.WebDriver;

import com.sophossolutions.www.question.ValidarCarrito;
import com.sophossolutions.www.question.ValidarCierreSesion;
import com.sophossolutions.www.question.ValidarInicioSesion;
import com.sophossolutions.www.task.AgregarAlCarrito;
import com.sophossolutions.www.task.BuscarProducto;
import com.sophossolutions.www.task.CerrarSesion;
import com.sophossolutions.www.task.IniciarSesion;
import com.sophossolutions.www.task.SeleccionarProducto;
import com.sophossolutions.www.userInterface.ConfirmacionInicioSesion;
import com.sophossolutions.www.userInterface.ConfirmacionProducto;
import com.sophossolutions.www.userInterface.ConfirmarCierreSesion;
import com.sophossolutions.www.userInterface.InicioDafiti;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;

public class StepDefinitionsIniciarSesionDafiti {

	@Managed(driver = "chrome")
	private WebDriver web;
	private InicioDafiti inicio;
	
	@Before
	public void setUp() {
		web.manage().window().maximize();
		theActorInTheSpotlight().can(BrowseTheWeb.with(web));
	}
	
	@Given("^se desea iniciar sesion en dafiti$")
	public void iniciarDafiti() {
		theActorInTheSpotlight().wasAbleTo(Open.browserOn(inicio));
	}

	@When("^con los datos nombre de usuario \"([^\"]*)\" y contrasena \"([^\"]*)\"$")
	public void iniciarSesion(String nombreUsuario, String contrasena) {
		theActorInTheSpotlight().attemptsTo(IniciarSesion.iniciarSesion(nombreUsuario, contrasena));
	}

	@Then("^validar que si se inicio sesion$")
	public void validarInicioSesion() {
		theActorInTheSpotlight()
				.should(seeThat(ValidarInicioSesion.validacionInicio(ConfirmacionInicioSesion.USURIOINICIADO),
						equalTo("HOLA, JERSON")));
	}

	@When("^anadir al carrito el producto \"([^\"]*)\"$")
	public void anadirCarrito(String producto) {
		theActorInTheSpotlight().attemptsTo(BuscarProducto.buscar(producto), SeleccionarProducto.seleccionar(),
				AgregarAlCarrito.agregar());
	}

	@Then("^Validar articulo en el carrito de compra$")
	public void validarCarrito() {
		theActorInTheSpotlight().should(seeThat(ValidarCarrito.validarProducto(ConfirmacionProducto.PRODUCTOCARRITO),
				equalTo("Reloj Invicta 27350 Oro Negro Silicona, Acero Inoxidable, Poliuretano.")));
	}

	@When("^se cierra la sesion del usuario$")
	public void cerrarSesion() {
		theActorInTheSpotlight().attemptsTo(CerrarSesion.cerrar());
	}

	@Then("^Validar que se cerro la sesion$")
	public void validarCierreSesion() {
		theActorInTheSpotlight().should(
				seeThat(ValidarCierreSesion.validacionCierre(ConfirmarCierreSesion.ETIQUETA), equalTo("Registrate")));
	}

}
