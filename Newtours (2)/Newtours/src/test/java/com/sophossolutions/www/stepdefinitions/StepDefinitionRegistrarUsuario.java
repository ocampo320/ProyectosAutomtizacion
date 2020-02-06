package com.sophossolutions.www.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotVisible;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

import java.util.List;
import java.util.Map;

// Importaciones Librería
import org.openqa.selenium.WebDriver;

import com.sophossolutions.www.userinterfaces.PaginaCatalogo;
import com.sophossolutions.www.userinterfaces.PaginaInicioSesion;
import com.sophossolutions.www.userinterfaces.PaginaRegistroUsuario;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Managed;
// Importaciones Proyecto
import www.sophossolutions.www.tasks.AccederEnlace;
import www.sophossolutions.www.tasks.CompletarInfoPerfil;
import www.sophossolutions.www.tasks.DiligenciarInfoCuenta;
import www.sophossolutions.www.tasks.DiligenciarInfoUsuario;
import www.sophossolutions.www.tasks.NavegarASitio;

// Clase
public class StepDefinitionRegistrarUsuario {

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

	@Given("^He accedido a la pagina de registro de un usuario$")
	public void ingresarPaginaRegistroUsuario() {
		actor.wasAbleTo(NavegarASitio.paginaInicio(), AccederEnlace.irA(PaginaCatalogo.ENLACE_SIGN_IN), AccederEnlace.irA(PaginaInicioSesion.ENLACE_REGISTRO));
	}

	@When("^He diligenciado la informacion de un nuevo usuario, con ID: '(.*)' y Clave: '(.*)'$")
	public void diligenciarInfoUsuario(String id, String clave) {
		actor.attemptsTo(DiligenciarInfoUsuario.con(id, clave));
	}

	@When("^He diligenciado la informacion de la cuenta, con Nombre: '(.*)', Apellido: '(.*)', Email: '(.*)', Telefono: '(.*)', Direccion: '(.*)', Ciudad: '(.*)', Estado: '(.*)', Zip: '(.*)' y Pais:'(.*)'$")
	public void diligenciarInfoCuenta(String nombre, String apellido, String email, String telefono, String direccion,
			String ciudad, String estado, String zip, String pais) throws Exception {
		actor
				.attemptsTo(DiligenciarInfoCuenta.con(nombre, apellido, email, telefono, direccion, ciudad, estado, zip, pais));
	}

	@When("^He diligenciado la informacion de perfil, con Lenguaje: '(.*)', Categoria: '(.*)', '(.*)' MyList y '(.*)' MyBanner$")
	public void diligenciarInfoPerfil(String idioma, String categoria, String myList, String myBanner) {
		actor.attemptsTo(CompletarInfoPerfil.con(idioma, categoria, myList, myBanner),
				Click.on(PaginaRegistroUsuario.BOTON_GUARDAR_CUENTA));
	}

	@Then("^Debe cargar la pagina del catalogo, sin iniciar sesion aun$")
	public void validarRegistroCorrecto() throws Exception {
		actor.should(seeThat(the(PaginaCatalogo.IMAGEN_CATALOGO), isVisible()),
				seeThat(the(PaginaCatalogo.BIENVENIDA), isNotVisible()));
	}

	@Given("^He diligenciado la informacion de un nuevo usuario$")
	public void llenarFormulario(List<Map<String, String>> listaDatos) {

		Map<String, String> mapaUsuario = listaDatos.get(0);

		actor.attemptsTo(DiligenciarInfoUsuario.con(mapaUsuario.get("id"), mapaUsuario.get("password")),
				DiligenciarInfoCuenta.con(mapaUsuario.get("name"), mapaUsuario.get("lastName"), mapaUsuario.get("email"),
						mapaUsuario.get("telephone"), mapaUsuario.get("address"), mapaUsuario.get("city"), mapaUsuario.get("state"),
						mapaUsuario.get("postalCode"), mapaUsuario.get("country")),
				AccederEnlace.irA(PaginaRegistroUsuario.BOTON_GUARDAR_CUENTA));

	}

}
