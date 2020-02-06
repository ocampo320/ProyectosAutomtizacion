package com.sophossolutions.www.userInterface;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class ProductoDisponible {

	public static final Target PRODUCTO = Target.the("Entrar producto a buscar")
			.located(By.xpath("//*[@id='searchInput']"));

	public static final Target BOTONBUSCAR = Target.the("Seleccionar la opcion buscar").located(By.name("submit"));

}
