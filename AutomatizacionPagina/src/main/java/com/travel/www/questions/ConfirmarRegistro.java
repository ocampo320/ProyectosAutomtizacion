package com.travel.www.questions;



import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;


import static com.travel.www.interfacesuser.RegistroUsuario.USUARIO_REGISTRADO;
public class ConfirmarRegistro implements Question<Boolean>{

	@Override
	public Boolean answeredBy(Actor actor) {
		return USUARIO_REGISTRADO.resolveFor(actor).isVisible();
	}
	
	public static ConfirmarRegistro usuario() {
		return new ConfirmarRegistro();
	}


}
