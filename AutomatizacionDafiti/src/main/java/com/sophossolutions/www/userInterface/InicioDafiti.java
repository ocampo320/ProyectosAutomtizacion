package com.sophossolutions.www.userInterface;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.dafiti.com.co/masculino/")
public class InicioDafiti extends PageObject {

	public static final Target INICIARSESION = Target.the("Selecciona la opción iniciar sesion")
			.located(By.xpath("//*[@id='LoginInfoTag']/span"));
	public static final Target NOMBREUSUARIO = Target.the("Se ingresa el nombre de usuario")
			.located(By.name("LoginForm[email]"));
	public static final Target CONTRASENA = Target.the("Se ingresa contraseña").located(By.name("LoginForm[password]"));
	public static final Target BOTONINICIARSESION = Target.the("Selecciona el boton iniciar sesion")
			.located(By.xpath("//*[@id='loginButton']"));

}
