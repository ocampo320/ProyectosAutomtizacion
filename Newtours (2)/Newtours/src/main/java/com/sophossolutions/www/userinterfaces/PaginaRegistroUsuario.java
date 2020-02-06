package com.sophossolutions.www.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

// Clase
public class PaginaRegistroUsuario {

	// Rutas XPath
	private static final String PATH_INPUT_ID = "//input[@name='username']";
	private static final String PATH_INPUT1_CLAVE = "//input[@name='password']";
	private static final String PATH_INPUT2_CLAVE = "//input[@name='repeatedPassword']";
	private static final String PATH_INPUT_NOMBRE = "//input[@name='account.firstName']";
	private static final String PATH_INPUT_APELLIDO = "//input[@name='account.lastName']";
	private static final String PATH_INPUT_EMAIL = "//input[@name='account.email']";
	private static final String PATH_INPUT_TELEFONO = "//input[@name='account.phone']";
	private static final String PATH_INPUT_DIRECCION = "//input[@name='account.address1']";
	private static final String PATH_INPUT_CIUDAD = "//input[@name='account.city']";
	private static final String PATH_INPUT_ESTADO = "//input[@name='account.state']";
	private static final String PATH_INPUT_ZIP = "//input[@name='account.zip']";
	private static final String PATH_INPUT_PAIS = "//input[@name='account.country']";
	private static final String PATH_SELECT_IDIOMA = "//select[@name='account.languagePreference']";
	private static final String PATH_SELECT_CATEGORIA = "//select[@name='account.favouriteCategoryId']";
	private static final String PATH_CHECKBOX_LIST = "//input[@name='account.listOption']";
	private static final String PATH_CHECKBOX_BANNER = "//input[@name='account.bannerOption']";
	private static final String PATH_BOTON_GUARDAR_CUENTA = "//input[@name='newAccount']";
	
	// Targets
	public static final Target INPUT_ID = Target.the("Input ID Nuevo Usuario").located(By.xpath(PATH_INPUT_ID));
	public static final Target INPUT1_CLAVE = Target.the("Input Clave Nuevo Usuario").located(By.xpath(PATH_INPUT1_CLAVE));
	public static final Target INPUT2_CLAVE = Target.the("Input Confirmación Clave").located(By.xpath(PATH_INPUT2_CLAVE));
	public static final Target INPUT_NOMBRE = Target.the("Input Nombre Usuario").located(By.xpath(PATH_INPUT_NOMBRE));
	public static final Target INPUT_APELLIDO = Target.the("Input Apellido Usuario").located(By.xpath(PATH_INPUT_APELLIDO));
	public static final Target INPUT_EMAIL = Target.the("Input Correo Usuario").located(By.xpath(PATH_INPUT_EMAIL));
	public static final Target INPUT_TELEFONO = Target.the("Input Teléfono Usuario").located(By.xpath(PATH_INPUT_TELEFONO));
	public static final Target INPUT_DIRECCION = Target.the("Input Dirección Usuario").located(By.xpath(PATH_INPUT_DIRECCION));
	public static final Target INPUT_CIUDAD = Target.the("Input Ciudad Usuario").located(By.xpath(PATH_INPUT_CIUDAD));
	public static final Target INPUT_ESTADO = Target.the("Input Estado Usuario").located(By.xpath(PATH_INPUT_ESTADO));
	public static final Target INPUT_ZIP = Target.the("Input Zip Usuario").located(By.xpath(PATH_INPUT_ZIP));
	public static final Target INPUT_PAIS = Target.the("Input País Usuario").located(By.xpath(PATH_INPUT_PAIS));
	public static final Target SELECT_IDIOMA = Target.the("Select Idioma Preferido").located(By.xpath(PATH_SELECT_IDIOMA));
	public static final Target SELECT_CATEGORIA = Target.the("Select Categoría Preferida").located(By.xpath(PATH_SELECT_CATEGORIA));
	public static final Target CHECKBOX_LIST = Target.the("Checkbox MyList").located(By.xpath(PATH_CHECKBOX_LIST));
	public static final Target CHECKBOX_BANNER = Target.the("Checkbox MyBanner").located(By.xpath(PATH_CHECKBOX_BANNER));
	public static final Target BOTON_GUARDAR_CUENTA = Target.the("Botón Guardar Cuenta").located(By.xpath(PATH_BOTON_GUARDAR_CUENTA));
	
	
}
