package www.sophossolutions.www.tasks;

import com.sophossolutions.www.userinterfaces.PaginaInicioSesion;

// Importaciones
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

// Clase
public class IngresarCuenta implements Task {

	// Atributos
	private final String usuario;
	private final String clave;

	// Constructor
	public IngresarCuenta(String usuario, String clave) {
		this.usuario = usuario;
		this.clave = clave;
	}

	// Constructor Estático
	public static IngresarCuenta deUsuario(String usuario, String clave) {
		return Tasks.instrumented(IngresarCuenta.class, usuario, clave);
	}

	// Método Interfaz
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Enter.theValue(usuario).into(PaginaInicioSesion.INPUT_USUARIO),
				Enter.theValue(clave).into(PaginaInicioSesion.INPUT_CLAVE), Click.on(PaginaInicioSesion.BOTON_LOGIN));
	}

}
