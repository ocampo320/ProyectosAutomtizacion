package com.sophossolutions.www.question;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class ValidarCierreSesion implements Question<String> {

	private Target target;

	public ValidarCierreSesion(Target target) {
		this.target = target;
	}

	public static ValidarCierreSesion validacionCierre(Target target) {
		return new ValidarCierreSesion(target);
	}

	@Override
	public String answeredBy(Actor actor) {
		return Text.of(target).viewedBy(actor).asString();
	}

}
