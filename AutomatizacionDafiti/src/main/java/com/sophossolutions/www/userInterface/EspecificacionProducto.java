package com.sophossolutions.www.userInterface;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class EspecificacionProducto {

	public static final Target AGREGARCARRITO = Target.the("Seleccionar opcion agregar al carrito")
			.located(By.xpath("//*[@id='AddToCart']"));

	public static final Target CARRITO = Target.the("Seleccionar opcion ir al carrito")
			.located(By.xpath("//*[@id='cart-head']"));

}
