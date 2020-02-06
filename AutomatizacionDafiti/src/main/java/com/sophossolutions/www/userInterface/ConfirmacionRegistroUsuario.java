package com.sophossolutions.www.userInterface;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class ConfirmacionRegistroUsuario {
	public static final Target MYACCOUNT = Target.the("Texto a validar").located(By.xpath("//*[@id='yw0']/li[1]/a"));
}
