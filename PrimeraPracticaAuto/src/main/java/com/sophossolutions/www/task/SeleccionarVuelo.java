package com.sophossolutions.www.task;

import com.sophossolutions.www.userinterfaces.VueloDisponible;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class SeleccionarVuelo implements Task {

	public static SeleccionarVuelo seleccionarVuelo() {
		return Tasks.instrumented(SeleccionarVuelo.class);
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(VueloDisponible.SELECCIONARVUELO));

	}

}
