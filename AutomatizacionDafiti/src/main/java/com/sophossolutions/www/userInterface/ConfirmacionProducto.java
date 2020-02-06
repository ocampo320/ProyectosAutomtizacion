package com.sophossolutions.www.userInterface;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class ConfirmacionProducto {

	public static final Target PRODUCTOCARRITO = Target.the("Texto a validar")
			.located(By.xpath("//*[@id='cart-items-list-form']/div[1]/div[1]/a[2]"));
}
