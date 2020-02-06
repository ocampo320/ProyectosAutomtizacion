package com.sophossolutions.www.userInterface;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class ConfirmarCierreSesion {

	public static final Target ETIQUETA = Target.the("Texto a validar")
			.located(By.xpath("//*[@id='LoginInfoTag']/span/span"));

}
