package com.sophossolutions.www.userInterface;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class SeleccionDeProducto {

	public static final Target PRODUCTOSELECCIONADO = Target.the("Seleccion del producto buscado")
			.located(By.xpath("//*[@id='1:IN434AC66YINCO']/div/img"));

}
