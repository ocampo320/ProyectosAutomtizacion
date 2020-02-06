package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterfaces.InicioDafiti;

public class IniciarSesion implements Task {

	private String email;
	private String contrase�aUsuario;

	public IniciarSesion(String email, String contrase�aUsuario) {

		this.email = email;
		this.contrase�aUsuario = contrase�aUsuario;
	}

	public static IniciarSesion inicioSesion(String email, String contrase�aUsuario) {
		return Tasks.instrumented(IniciarSesion.class, email, contrase�aUsuario);

	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(InicioDafiti.REGISTRO), 
				Enter.theValue(email).into(InicioDafiti.EMAIL),
				Enter.theValue(contrase�aUsuario).into(InicioDafiti.CONTRASE�A),
				Click.on(InicioDafiti.ENVIAR));
	}

}
