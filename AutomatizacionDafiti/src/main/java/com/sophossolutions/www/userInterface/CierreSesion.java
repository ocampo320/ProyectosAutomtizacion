package com.sophossolutions.www.userInterface;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class CierreSesion {

	public static final Target PERFIL = Target.the("Deslisar sobre perfil")
			.located(By.xpath("//*[@id='LoginInfoTag']/span"));

	public static final Target CERRARSESION = Target.the("Seleccionar opcion salir")
			.located(By.xpath("//*[@id='hdMenuContainer']/ul/li[8]/a"));
}
