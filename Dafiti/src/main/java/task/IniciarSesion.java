package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterfaces.InicioDafiti;

public class IniciarSesion implements Task {

	private String email;
	private String contraseņaUsuario;

	public IniciarSesion(String email, String contraseņaUsuario) {

		this.email = email;
		this.contraseņaUsuario = contraseņaUsuario;
	}

	public static IniciarSesion inicioSesion(String email, String contraseņaUsuario) {
		return Tasks.instrumented(IniciarSesion.class, email, contraseņaUsuario);

	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(InicioDafiti.REGISTRO), 
				Enter.theValue(email).into(InicioDafiti.EMAIL),
				Enter.theValue(contraseņaUsuario).into(InicioDafiti.CONTRASEŅA),
				Click.on(InicioDafiti.ENVIAR));
	}

}
