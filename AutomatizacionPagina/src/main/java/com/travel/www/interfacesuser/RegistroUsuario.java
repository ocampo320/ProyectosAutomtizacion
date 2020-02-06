package com.travel.www.interfacesuser;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class RegistroUsuario {
	
	
	public static final Target NOMBRE = Target.the("Selecciona la opción nombre").located(By.xpath(
			"/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/input"));

	public static final Target APELLIDO = Target.the("Selecciona la opción apellido").located(By.xpath(
			"/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[3]/td[2]/input"));

	public static final Target TELEFONO = Target.the("Selecciona la opción telefono").located(By.xpath(
			"/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[4]/td[2]/input"));

	public static final Target EMAIL = Target.the("Selecciona la opción correo")
			.located(By.xpath("//*[@id=\"userName\"]"));

	public static final Target ADDRES = Target.the("Selecciona la opción clave").located(By.xpath(
			"/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[7]/td[2]/input"));

	public static final Target ADDRES2 = Target.the("Selecciona la opción clave2").located(By.xpath(
			"/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[8]/td[2]/input"));

	public static final Target CIUDAD = Target.the("Selecciona la opción ciudad").located(By.xpath(
			"/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/input"));

	public static final Target PROVINCIA = Target.the("Selecciona la opción provinvica").located(By.xpath(
			"/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[10]/td[2]/input"));

	public static final Target CODIGO_POSTAL = Target.the("Selecciona la opción c postal").located(By.xpath(
			"/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[11]/td[2]/input"));

	public static final Target PAIS = Target.the("Selecciona la opción pais").located(By.xpath(
			"/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[12]/td[2]/select"));

	public static final Target USERNAME = Target.the("Selecciona la opción username")
			.located(By.xpath("//*[@id=\"email\"]"));

	public static final Target PASSWORD = Target.the("Selecciona la opción password").located(By.xpath(
			"/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[15]/td[2]/input"));

	public static final Target COMFIRMPASSWORD = Target.the("Selecciona la opción confirmar clave").located(By.xpath(
			"/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[16]/td[2]/input"));

	public static final Target ENVIAR = Target.the("Selecciona la opción enviar").located(By.xpath(
			"/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[18]/td/input"));

	public static final Target USUARIO_REGISTRADO = Target.the("Selecciona la opción usuario registrado").located(By.xpath(
			"/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/img"));

	

	
	
	
}
