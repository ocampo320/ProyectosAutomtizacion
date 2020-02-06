package com.sophossolutions.www.task;

import com.sophossolutions.www.userInterface.InicioDafiti;
import com.sophossolutions.www.userInterface.RegistroDeUsuario;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class RegistrarUsuario implements Task {

	private final String email;
	private final String contrasena;
	private final String confirmarContrasena;
	private final String nombre;
	private final String apellidos;
	private final String documento;
	private final String diaNacimiento;
	private final String mesNacimiento;
	private final String anioNacimiento;
	private final String sexo;

	public RegistrarUsuario(String email, String contrasena, String confirmarContrasena, String nombre,
			String apellidos, String documento, String diaNacimiento, String mesNacimiento, String anioNacimiento,
			String sexo) {
		this.email = email;
		this.contrasena = contrasena;
		this.confirmarContrasena = confirmarContrasena;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.documento = documento;
		this.diaNacimiento = diaNacimiento;
		this.mesNacimiento = mesNacimiento;
		this.anioNacimiento = anioNacimiento;
		this.sexo = sexo;
	}

	public static RegistrarUsuario registrar(String email, String contrasena, String confirmarContrasena, String nombre,
			String apellidos, String documento, String diaNacimiento, String mesNacimiento, String anioNacimiento,
			String sexo) {
		return Tasks.instrumented(RegistrarUsuario.class, email, contrasena, confirmarContrasena, nombre, apellidos,
				documento, diaNacimiento, mesNacimiento, anioNacimiento, sexo);
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(InicioDafiti.INICIARSESION), Enter.theValue(email).into(RegistroDeUsuario.EMAIL),
				Enter.theValue(contrasena).into(RegistroDeUsuario.CONTRASENA),
				Enter.theValue(confirmarContrasena).into(RegistroDeUsuario.CONFIRMARCONTRASENA),
				Enter.theValue(nombre).into(RegistroDeUsuario.NOMBRE),
				Enter.theValue(apellidos).into(RegistroDeUsuario.APELLIDOS),
				Enter.theValue(documento).into(RegistroDeUsuario.DOCUMENTO),
				Enter.theValue(diaNacimiento).into(RegistroDeUsuario.DIANACIMIENTO),
				Enter.theValue(mesNacimiento).into(RegistroDeUsuario.MESNACIMIENTO),
				SelectFromOptions.byVisibleText(anioNacimiento).from(RegistroDeUsuario.ANIONACIMIENTO),
				SelectFromOptions.byVisibleText(sexo).from(RegistroDeUsuario.SEXO),
				Click.on(RegistroDeUsuario.REGISTRAR));

	}

}
