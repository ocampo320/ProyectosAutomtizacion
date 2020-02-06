package com.sophossolutions.www.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://petstore.octoperf.com/")
public class PaginaInicio extends PageObject {
	
	// Rutas XPath
	private static final String PATH_ENLACE_INGRESAR = "//*[@id='Content']/p[1]/a";
	
	// Targets
	public static final Target ENLACE_INGRESAR = Target.the("Enlace Ingresar").located(By.xpath(PATH_ENLACE_INGRESAR));
}
