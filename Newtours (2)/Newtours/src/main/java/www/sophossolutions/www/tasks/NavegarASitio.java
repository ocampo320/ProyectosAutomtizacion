package www.sophossolutions.www.tasks;

// Importaciones Proyecto
import com.sophossolutions.www.userinterfaces.PaginaInicio;

// Importaciones Librer�a
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;

// Clase
public class NavegarASitio implements Task {

	// Atributos
	private PaginaInicio paginaInicio;

	// Constructor Est�tico
	public static NavegarASitio paginaInicio() {
		return Tasks.instrumented(NavegarASitio.class);
	}

	// M�todo Interfaz
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Open.browserOn(paginaInicio), Click.on(PaginaInicio.ENLACE_INGRESAR));
	}
}
