package com.sophossolutions.www.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class PaginaCatalogo {
	
	// Rutas XPath
	private static final String PATH_IMAGEN_CATALOGO = "//*[@id=\"MainImageContent\"]/img[@src='../images/splash.gif']";
	private static final String PATH_IMAGEN_INEXISTENTE = "//*[@id=\"MainImageContent\"]/img[@src='noExiste.png']";
	private static final String PATH_ENLACE_SIGN_IN = "//*[@id='MenuContent']/a[.='Sign In']";
	private static final String PATH_ENLACE_SIGN_OUT = "//*[@id='MenuContent']/a[.='Sign Out']";
	private static final String PATH_BIENVENIDA = "//*[@id='WelcomeContent']";
	
	// Targets
	public static final Target IMAGEN_CATALOGO = Target.the("Imagen Catálogo").located(By.xpath(PATH_IMAGEN_CATALOGO));
	public static final Target IMAGEN_INEXISTENTE = Target.the("Imagen Inexistente").located(By.xpath(PATH_IMAGEN_INEXISTENTE));
	public static final Target ENLACE_SIGN_IN = Target.the("Enlace Menú Iniciar Sesión").located(By.xpath(PATH_ENLACE_SIGN_IN));
	public static final Target ENLACE_SIGN_OUT = Target.the("Enlace Menú Cerrar Sesión").located(By.xpath(PATH_ENLACE_SIGN_OUT));
	public static final Target BIENVENIDA = Target.the("Mensaje Bienvenida Usuario").located(By.xpath(PATH_BIENVENIDA));
}




