package com.sophossolutions.www.questions;

import com.sophossolutions.www.userinterfaces.PaginaCatalogo;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

// Clase
public class QuestionTexto implements Question<String> {

	// Atributos
	private Target elementoVerificar;

	// Constructor
	public QuestionTexto(Target elementoVerificar) {
		this.elementoVerificar = elementoVerificar;
	}
	
	// Constructor Estático
	public static QuestionTexto usuarioSesion() {
		return new QuestionTexto(PaginaCatalogo.BIENVENIDA);
	}
	
	// Método Interfaz
	@Override
	public String answeredBy(Actor actor) {
		return Text.of(elementoVerificar).viewedBy(actor).asString().trim();
	}

}
