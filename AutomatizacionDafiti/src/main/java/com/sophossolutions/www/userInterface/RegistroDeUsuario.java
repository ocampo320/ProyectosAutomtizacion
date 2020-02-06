package com.sophossolutions.www.userInterface;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class RegistroDeUsuario {

	public static final Target EMAIL = Target.the("Entrar el email").located(By.name("RegistrationForm[email]"));
	public static final Target CONTRASENA = Target.the("Entrar la contraseña")
			.located(By.name("RegistrationForm[password]"));
	public static final Target CONFIRMARCONTRASENA = Target.the("Entrar confirmar contraseña")
			.located(By.name("RegistrationForm[password2]"));
	public static final Target NOMBRE = Target.the("Entrar el nombre").located(By.name("RegistrationForm[first_name]"));
	public static final Target APELLIDOS = Target.the("Entrar los apellidos")
			.located(By.name("RegistrationForm[last_name]"));
	public static final Target DOCUMENTO = Target.the("Entrar el documento")
			.located(By.name("RegistrationForm[identification]"));
	public static final Target DIANACIMIENTO = Target.the("Entrar el dia de nacimiento")
			.located(By.name("RegistrationForm[day]"));
	public static final Target MESNACIMIENTO = Target.the("Entrar el mes de nacimiento")
			.located(By.name("RegistrationForm[month]"));
	public static final Target ANIONACIMIENTO = Target.the("Entrar el año de nacimiento")
			.located(By.name("RegistrationForm[year]"));
	public static final Target SEXO = Target.the("Entrar el sexo").located(By.name("RegistrationForm[gender]"));
	public static final Target REGISTRAR = Target.the("Seleccionar la opcion Registrar")
			.located(By.xpath("//*[@id='createAccountButton']"));
}
