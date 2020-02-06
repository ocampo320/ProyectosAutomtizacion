package com.travel.www.task;

import com.travel.www.interfacesuser.InicioSesionInterfaz;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import com.*;

public class InicioSesion  implements Task{
	
	private String nombreUsuario;
	private String contrase�aUsuario;
	
	

	public InicioSesion(String nombreUsuario, String contrase�aUsuario) {
		super();
		this.nombreUsuario = nombreUsuario;
		this.contrase�aUsuario = contrase�aUsuario;
	}
	
	public static InicioSesion iniciarSesion(String nombreUsuario, String contrase�aUsuario) {
		return Tasks.instrumented(InicioSesion.class, nombreUsuario, contrase�aUsuario);
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(InicioSesionInterfaz.DESLOGEO), 
				Enter.theValue(nombreUsuario).into(InicioSesionInterfaz.NOMBRE_USUARIO),
				Enter.theValue(contrase�aUsuario).into(InicioSesionInterfaz.CONTRASE�A_USUARIO),
				Click.on(InicioSesionInterfaz.ENVIAR)
				);
		
	}




	
	

}
