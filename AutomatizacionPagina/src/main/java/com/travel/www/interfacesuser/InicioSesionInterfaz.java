package com.travel.www.interfacesuser;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class InicioSesionInterfaz {

	

	public static final Target DESLOGEO = Target.the("Selecciona la opción vuelos")
			.located(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[1]/a"));

	public static final Target NOMBRE_USUARIO = Target.the("Selecciona la opción vuelos").located(By.xpath(
			"/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[1]/td[2]/input"));

	public static final Target CONTRASEÑA_USUARIO = Target.the("Selecciona la opción vuelos").located(By.xpath(
			"/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/input"));

	public static final Target ENVIAR = Target.the("Selecciona la opción vuelos").located(By.xpath(
			"/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[4]/td/input"));

	public static final Target USUARIO_LOGEADO = Target.the("Selecciona la opción vuelos").located(By.xpath(
			"/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/img"));

}
