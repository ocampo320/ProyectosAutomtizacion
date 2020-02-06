package com.sophossolutions.www.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class PaginaInicioSesion {
	
	// Rutas XPath
	private static final String PATH_INPUT_USUARIO = "//input[@name='username']";
	private static final String PATH_INPUT_CLAVE = "//input[@name='password']";
	private static final String PATH_BOTON_LOGIN = "//input[@name='signon']";
	private static final String PATH_ENLACE_REGISTRO = "//*[@id=\"Catalog\"]/a[.='Register Now!']";	
	
	// Targets
	public static final Target INPUT_USUARIO = Target.the("Input Usuario Inicio Sesión").located(By.xpath(PATH_INPUT_USUARIO));
	public static final Target INPUT_CLAVE = Target.the("Input Clave Inicio Sesión").located(By.xpath(PATH_INPUT_CLAVE));
	public static final Target BOTON_LOGIN = Target.the("Botón Login").located(By.xpath(PATH_BOTON_LOGIN));
	public static final Target ENLACE_REGISTRO = Target.the("Enlace Registro Usuario").located(By.xpath(PATH_ENLACE_REGISTRO));

}
