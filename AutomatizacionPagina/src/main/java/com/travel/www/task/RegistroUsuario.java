package com.travel.www.task;

import com.travel.www.interfacesuser.InicioPagina;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;




public class RegistroUsuario  implements Task{
	
	private String nombre;
	private String apellido;
	private String celular;
	private String correo;
	private String direccion;
	private String ciudad;
	private String provincia;
	private String codigoPostal;
	private String nombreUsuario;
	private String contraseña;
	



	public RegistroUsuario(String nombre, String apellido, String celular, String correo, String direccion,
			String ciudad, String provincia, String codigoPostal, String nombreUsuario, String contraseña) {

		this.nombre = nombre;
		this.apellido = apellido;
		this.celular = celular;
		this.ciudad = ciudad;
		this.correo = correo;
		this.direccion = direccion;
		this.codigoPostal = codigoPostal;
		this.nombreUsuario = nombreUsuario;
		this.contraseña = contraseña;
		this.provincia=provincia;

	}
	
	
	


	public static RegistroUsuario nuevo(String nombre, String apellido, String celular, String correo, String direccion,
			 String ciudad, String provincia, String codigoPostal, String nombreUsuario, String contraseña ) {

		return Tasks.instrumented(RegistroUsuario.class, nombre, apellido, celular, correo, direccion, ciudad,
				provincia, codigoPostal, nombreUsuario, contraseña);
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(InicioPagina.BTN_REGISTRO),
				
				Enter.theValue(nombre).into(com.travel.www.interfacesuser.RegistroUsuario.NOMBRE),
				Enter.theValue(apellido).into(com.travel.www.interfacesuser.RegistroUsuario.APELLIDO),
				Enter.theValue(celular).into(com.travel.www.interfacesuser.RegistroUsuario.TELEFONO),
				Enter.theValue(correo).into(com.travel.www.interfacesuser.RegistroUsuario.EMAIL),
				Enter.theValue(direccion).into(com.travel.www.interfacesuser.RegistroUsuario.ADDRES),
				Enter.theValue(direccion).into(com.travel.www.interfacesuser.RegistroUsuario.ADDRES2),
				Enter.theValue(ciudad).into(com.travel.www.interfacesuser.RegistroUsuario.CIUDAD),
				Enter.theValue(provincia).into(com.travel.www.interfacesuser.RegistroUsuario.PROVINCIA),
				Enter.theValue(codigoPostal).into(com.travel.www.interfacesuser.RegistroUsuario.CODIGO_POSTAL),
				Enter.theValue(nombreUsuario).into(com.travel.www.interfacesuser.RegistroUsuario.USERNAME),
				Enter.theValue(contraseña).into(com.travel.www.interfacesuser.RegistroUsuario.PASSWORD),
				Enter.theValue(contraseña).into(com.travel.www.interfacesuser.RegistroUsuario.COMFIRMPASSWORD),
				Click.on(com.travel.www.interfacesuser.RegistroUsuario.ENVIAR));
		
	}

}
