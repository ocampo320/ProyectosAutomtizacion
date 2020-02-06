package com.travel.www.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

import org.eclipse.jetty.util.annotation.ManagedAttribute;
import org.openqa.selenium.WebDriver;

import com.travel.www.exceptions.ErrorRegistro;
import com.travel.www.interfacesuser.InicioPagina;
import com.travel.www.interfacesuser.RegistroUsuario;
import com.travel.www.questions.ConfirmarRegistro;
import com.travel.www.task.InicioSesion;

import cucumber.api.java.Before;
import cucumber.api.java.en.*;

import jxl.read.biff.SetupRecord;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;


import com.*;

public class EstepsTravel {

	@Managed(driver = "chrome")
	private WebDriver web;
	private Actor actor = Actor.named("deivi");
	private InicioPagina inicioPagina;

	@Before
	public void setUp() {
		web.manage().window().maximize();
		actor.can(BrowseTheWeb.with(web));
	}

	@Given("^Ingrese a la pagina$")
	public void ingrese_a_la_pagina() {

	}

	@When("^un usuario se registra con los datos (.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*)$")
	public void un_usuario_se_registra_con_los_datos_deivi_ocampo_deivi_hotmail_cll_medellin_antioquia_deivi_deivi(String nombre, String apellido, String celular, String correo, String direccion,
			String ciudad, String provincia, String codigoPostal, String nombreUsuario, String contrasena) throws Exception {
	  
	   
	}

	@Then("^el usuario ve el mensaje de registro exitoso$")
	public void el_usuario_ve_el_mensaje_de_registro_exitoso() throws Exception {
	   
		actor.should(seeThat(ConfirmarRegistro.usuario()).orComplainWith(ErrorRegistro.class));
	}
	

@When("^El usuario hace login con las credenciales (.*),(.*)$")
public void el_usuario_hace_login_con_las_credenciales_deivi_y_deivi(String usuario, String contraseña) throws Exception {
	actor.attemptsTo(InicioSesion.iniciarSesion(usuario, contraseña));
}

@Then("^EL usuario se logea correctamente$")
public void el_usuario_se_logea_correctamente() throws Exception {
   
}
}


