package com.travel.www.questions;



import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import com.travel.www.interfacesuser.InicioSesionInterfaz.*;

public class ConfirmarInicioSesion implements Question<Boolean> {

	@Override
	public Boolean answeredBy(Actor actor) {
		return  com.travel.www.interfacesuser.InicioSesionInterfaz.USUARIO_LOGEADO .resolveFor(actor).isVisible();

	}
	
	public static ConfirmarInicioSesion user() {
		return new ConfirmarInicioSesion();
	
}
}

