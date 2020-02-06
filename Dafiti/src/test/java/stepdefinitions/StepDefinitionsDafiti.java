package stepdefinitions;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import task.AgregarCarrito;
import task.HacerBusqueda;
import task.IniciarSesion;
import task.RegistroUsuario;
import userinterfaces.BucarProductoDafiti;
import userinterfaces.InicioDafiti;

public class StepDefinitionsDafiti {

	@Managed(driver = "chrome")
	private WebDriver web;
	private Actor actor = Actor.named("deivi");
	private InicioDafiti inicio;

	@Before
	public void setUp() {
		web.manage().window().maximize();
		actor.can(BrowseTheWeb.with(web));
	}

	@Given("^Ingrese a la pagina$")
	public void ingrese_a_la_pagina() {
		actor.wasAbleTo(Open.browserOn(inicio));
	}

	@When("^Un usuario se logea con los datos (.*), (.*)$")
	public void un_usuario_se_logea_con_los_datoss(String email, String contraseñaUsuario) {

		actor.attemptsTo(IniciarSesion.inicioSesion(email, contraseñaUsuario));
	}

	@Then("^El usuario ve el mensaje de logeo exitoso$")
	public void el_usuario_ve_el_mensaje_de_logeo_exitoso() {

	}

	@When("^Un usuario se registra con los datos (.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*), (.*),(.*),(.*)$")
	public void un_usuario_se_registra_con_los_datos(String email, String password, String confirmarpassword,
			String nombre, String apellido, String docuemto, String tipoDocumentos, String fechaDia, String fechaMes,
			String fechaAño, String sexo) {
		// Write code here that turns the phrase above into concrete actions
		actor.attemptsTo(RegistroUsuario.registroUsuario(email, password, confirmarpassword, nombre, apellido, docuemto,
				tipoDocumentos, fechaDia, fechaMes, fechaAño, sexo));

	}

	@Then("^El usuario ve el mensaje de registro exitoso$")
	public void el_usuario_ve_el_mensaje_de_registro_exitoso() {
		

	}
	
	////////////////////////////////////
	

@When("^el usuario se hace una busqueda con los datos (.*)$")
public void el_usuario_se_hace_una_busqueda_con_los_datos_adidas(String buscar)  {
    actor.attemptsTo(HacerBusqueda.buscarProducto(buscar));
    
}

@Then("^agrega el producto al carrito con la talla (.*)$")
public void agrega_el_producto_al_carrito_con_la_talla(String talla) {
   actor.attemptsTo(AgregarCarrito.AgregarCarrito(talla));
}
	
}
