package userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class RegistrarUsuarioDafiti {

	
	public static final Target EMAIL = Target.the("Selecciona la opción vuelos")
			.located(By.xpath("//*[@id=\"RegistrationForm_email\"]"));

	public static final Target PASSWORD = Target.the("Selecciona la opción vuelos")
			.located(By.xpath("//*[@id=\"RegistrationForm_password\"]"));

	public static final Target COMFIRMPASSWORD = Target.the("Selecciona la opción vuelos")
			.located(By.xpath("//*[@id=\"RegistrationForm_password2\"]"));

	public static final Target NOMBRE = Target.the("Selecciona la opción vuelos").located(By.xpath(
			"//*[@id=\"RegistrationForm_first_name\"]"));

	public static final Target APELLIDO = Target.the("Selecciona la opción vuelos").located(By.xpath(
			"//*[@id=\"RegistrationForm_last_name\"]"));

	public static final Target DOCUMENTO = Target.the("Selecciona la opción vuelos").located(By.xpath(
			"//*[@id=\"RegistrationForm_identification\"]"));

	public static final Target TIPO_DOCUMENTO = Target.the("Selecciona la opción vuelos").located(By.xpath(
			"//*[@id=\"RegistrationForm_identification_type\"]"));

	public static final Target LISTA= Target.the("seleciona la cedula").located(By.xpath
			("//*[@id=\"RegistrationForm_identification_type\"]"));
	
	
	public static final Target FECHA_DIA = Target.the("Selecciona la opción vuelos").located(By.xpath(
			"//*[@id=\"RegistrationForm_day\"]"));

	public static final Target FECHA_MES = Target.the("Selecciona la opción vuelos").located(By.xpath(
			"//*[@id=\"RegistrationForm_month\"]"));

	public static final Target FECHA_AÑO = Target.the("Selecciona la opción vuelos").located(By.xpath(
			"//*[@id=\"RegistrationForm_year\"]"));

	public static final Target SEXO = Target.the("Selecciona la opción vuelos").located(By.xpath(
			"//*[@id=\"RegistrationForm_gender\"]"));

		public static final Target ENVIAR = Target.the("Selecciona la opción vuelos").located(By.xpath(
			"//*[@id=\"createAccountButton\"]"));
}
