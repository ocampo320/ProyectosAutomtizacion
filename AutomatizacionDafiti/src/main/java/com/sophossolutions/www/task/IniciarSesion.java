package com.sophossolutions.www.task;

import com.sophossolutions.www.userInterface.InicioDafiti;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class IniciarSesion implements Task {

	private String nombreUsuario;
	private String contrasena;

	public IniciarSesion(String nombreUsuario, String contrasena) {
		this.nombreUsuario = nombreUsuario;
		this.contrasena = contrasena;
	}

	public static IniciarSesion iniciarSesion(String nombreUsuario, String contrasena) {
		return Tasks.instrumented(IniciarSesion.class, nombreUsuario, contrasena);
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(InicioDafiti.INICIARSESION),
				Enter.theValue(nombreUsuario).into(InicioDafiti.NOMBREUSUARIO),
				Enter.theValue(contrasena).into(InicioDafiti.CONTRASENA), Click.on(InicioDafiti.BOTONINICIARSESION));

	}

}
