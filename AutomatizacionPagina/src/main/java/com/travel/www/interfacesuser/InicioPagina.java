package com.travel.www.interfacesuser;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://newtours.demoaut.com/")
public class InicioPagina extends PageObject {
	
	public static final Target BTN_REGISTRO= Target.the("Selecciona la opción de registro")
			.located(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a"));
	
	
	
	
	
	

}
