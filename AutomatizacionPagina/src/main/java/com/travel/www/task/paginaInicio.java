package com.travel.www.task;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class paginaInicio implements Task {

	
	private PageObject page;
	
	
	public paginaInicio(PageObject page) {
		super();
		this.page = page;
	}
	
	public static paginaInicio on(PageObject page) {
		return Tasks.instrumented(paginaInicio.class, page);
		// TODO Auto-generated constructor stub
	}


	@Override
	public <T extends Actor> void performAs(T actor) {
			actor.attemptsTo(Open.browserOn(page));
		
	}

}
