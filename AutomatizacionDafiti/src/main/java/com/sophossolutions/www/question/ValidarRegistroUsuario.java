package com.sophossolutions.www.question;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class ValidarRegistroUsuario implements Question<String> {

	private Target target;

	public ValidarRegistroUsuario(Target target) {
		this.target = target;
	}

	public static ValidarRegistroUsuario validarUsuario(Target target) {
		return new ValidarRegistroUsuario(target);
	}

	@Override
	public String answeredBy(Actor actor) {
		return Text.of(target).viewedBy(actor).asString();
	}

}
