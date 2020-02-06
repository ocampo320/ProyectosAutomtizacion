package com.sophossolutions.www.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;

import com.sophossolutions.www.question.ValidarRegistroUsuario;
import com.sophossolutions.www.task.RegistrarUsuario;
import com.sophossolutions.www.userInterface.ConfirmacionRegistroUsuario;
import com.sophossolutions.www.userInterface.InicioDafiti;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;

public class StepDefinitionsRegistrarUsuarioDafiti {

	//@Managed(driver = "chrome")
	//private WebDriver web;
	private InicioDafiti inicio;

	@Given("^se desea registrar un usuario en Dafiti$")
	public void IniciarDafiti() {
		theActorInTheSpotlight().attemptsTo(Open.browserOn(inicio));
	}

	@When("^Se diligencias los datos de usuario$")
	public void RegistrarUsuarioDafiti(List<Map<String, String>> listaDatos) {
		Map<String, String> mapaUsuario = listaDatos.get(0);

		theActorInTheSpotlight().attemptsTo(RegistrarUsuario.registrar(mapaUsuario.get("email"),
				mapaUsuario.get("contrasena"), mapaUsuario.get("contrasena"), mapaUsuario.get("nombre"),
				mapaUsuario.get("apellidos"), mapaUsuario.get("documento"), mapaUsuario.get("diaNacimiento"),
				mapaUsuario.get("mesNacimiento"), mapaUsuario.get("anioNacimiento"), mapaUsuario.get("sexo")));
	}

	@Then("^Validar registro del usuario$")
	public void validarRegistroUsuario() {
		theActorInTheSpotlight().should(seeThat(
				ValidarRegistroUsuario.validarUsuario(ConfirmacionRegistroUsuario.MYACCOUNT), equalTo("Mi cuenta")));
	}

}
