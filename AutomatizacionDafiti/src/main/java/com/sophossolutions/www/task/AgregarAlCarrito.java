package com.sophossolutions.www.task;

import com.sophossolutions.www.userInterface.EspecificacionProducto;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class AgregarAlCarrito implements Task {

	public static AgregarAlCarrito agregar() {
		return Tasks.instrumented(AgregarAlCarrito.class);
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(EspecificacionProducto.AGREGARCARRITO), Click.on(EspecificacionProducto.CARRITO));
	}

}
