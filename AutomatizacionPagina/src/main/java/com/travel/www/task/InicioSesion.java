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
	private String contraseñaUsuario;
	
	

	public InicioSesion(String nombreUsuario, String contraseñaUsuario) {
		super();
		this.nombreUsuario = nombreUsuario;
		this.contraseñaUsuario = contraseñaUsuario;
	}
	
	public static InicioSesion iniciarSesion(String nombreUsuario, String contraseñaUsuario) {
		return Tasks.instrumented(InicioSesion.class, nombreUsuario, contraseñaUsuario);
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(InicioSesionInterfaz.DESLOGEO), 
				Enter.theValue(nombreUsuario).into(InicioSesionInterfaz.NOMBRE_USUARIO),
				Enter.theValue(contraseñaUsuario).into(InicioSesionInterfaz.CONTRASEÑA_USUARIO),
				Click.on(InicioSesionInterfaz.ENVIAR)
				);
		
	}




	
	

}
