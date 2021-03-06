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
	private String contraseņaUsuario;
	
	

	public InicioSesion(String nombreUsuario, String contraseņaUsuario) {
		super();
		this.nombreUsuario = nombreUsuario;
		this.contraseņaUsuario = contraseņaUsuario;
	}
	
	public static InicioSesion iniciarSesion(String nombreUsuario, String contraseņaUsuario) {
		return Tasks.instrumented(InicioSesion.class, nombreUsuario, contraseņaUsuario);
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(InicioSesionInterfaz.DESLOGEO), 
				Enter.theValue(nombreUsuario).into(InicioSesionInterfaz.NOMBRE_USUARIO),
				Enter.theValue(contraseņaUsuario).into(InicioSesionInterfaz.CONTRASEŅA_USUARIO),
				Click.on(InicioSesionInterfaz.ENVIAR)
				);
		
	}




	
	

}
