package com.sophossolutions.www.task;

import com.sophossolutions.www.userInterface.CierreSesion;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Hover;

public class CerrarSesion implements Task {

	public static CerrarSesion cerrar() {
		return Tasks.instrumented(CerrarSesion.class);
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Hover.over(CierreSesion.PERFIL), Click.on(CierreSesion.CERRARSESION));
	}

}
