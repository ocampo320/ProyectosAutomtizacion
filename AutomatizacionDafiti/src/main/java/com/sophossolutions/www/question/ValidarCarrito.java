package com.sophossolutions.www.question;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class ValidarCarrito implements Question<String> {

	private Target target;

	public ValidarCarrito(Target target) {
		this.target = target;
	}

	public static ValidarCarrito validarProducto(Target target) {
		return new ValidarCarrito(target);
	}

	@Override
	public String answeredBy(Actor actor) {
		return Text.of(target).viewedBy(actor).asString();
	}

}
