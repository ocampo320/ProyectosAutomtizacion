package www.sophossolutions.www.tasks;

// Importaciones Librería
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

// Clase
public class AccederEnlace implements Task {

	// Atributos
	private Target target;

	// Constructor
	public AccederEnlace(Target target) {
		this.target = target;
	}

	public static AccederEnlace irA(Target target) {
		return Tasks.instrumented(AccederEnlace.class, target);
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(target));
	}

}
