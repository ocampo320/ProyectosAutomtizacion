package com.sophossolutions.www.userInterface;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class ConfirmacionInicioSesion {

	public static final Target USURIOINICIADO = Target.the("Texto a validar")
			.located(By.xpath("//*[@id='LoginInfoTag']/span"));

}
