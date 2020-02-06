package com.sophossolutions.www.question;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class ValidarInicioSesion implements Question<String> {

	private Target target;

	public ValidarInicioSesion(Target target) {
		this.target = target;
	}

	public static ValidarInicioSesion validacionInicio(Target target) {
		return new ValidarInicioSesion(target);
	}

	@Override
	public String answeredBy(Actor actor) {
		return Text.of(target).viewedBy(actor).asString();
	}

}
