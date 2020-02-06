package www.sophossolutions.www.tasks;

// Importaciones
import com.sophossolutions.www.userinterfaces.PaginaRegistroUsuario;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;

// Clase
public class DiligenciarInfoUsuario implements Task {

	// Atributos
	private final String id;
	private final String clave;

	// Constructor
	public DiligenciarInfoUsuario(String id, String clave) {
		this.id = id;
		this.clave = clave;
	}

	// Constructor Estático
	public static DiligenciarInfoUsuario con(String id, String clave) {
		return Tasks.instrumented(DiligenciarInfoUsuario.class, id, clave);
	}

	// Método Interfaz
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Enter.theValue(id).into(PaginaRegistroUsuario.INPUT_ID),
				Enter.theValue(clave).into(PaginaRegistroUsuario.INPUT1_CLAVE),
				Enter.theValue(clave).into(PaginaRegistroUsuario.INPUT2_CLAVE));
	}
}
