package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterfaces.InicioDafiti;

public class IniciarSesion implements Task {

	private String email;
	private String contraseñaUsuario;

	public IniciarSesion(String email, String contraseñaUsuario) {

		this.email = email;
		this.contraseñaUsuario = contraseñaUsuario;
	}

	public static IniciarSesion inicioSesion(String email, String contraseñaUsuario) {
		return Tasks.instrumented(IniciarSesion.class, email, contraseñaUsuario);

	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(InicioDafiti.REGISTRO), 
				Enter.theValue(email).into(InicioDafiti.EMAIL),
				Enter.theValue(contraseñaUsuario).into(InicioDafiti.CONTRASEÑA),
				Click.on(InicioDafiti.ENVIAR));
	}

}
