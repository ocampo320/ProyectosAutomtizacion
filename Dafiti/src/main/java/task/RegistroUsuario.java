package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import userinterfaces.InicioDafiti;
import userinterfaces.RegistrarUsuarioDafiti;

public class RegistroUsuario implements Task{

	private String email;
	private String password;
	private String confirmarpassword;
	private String nombre;
	private String apellido;
	private String docuemto;
	private String tipoDocumentos;
	private String fechaDia;
	private String fechaMes;
	private String fechaAño;
	private String sexo;
	public RegistroUsuario(String email, String password, String confirmarpassword, String nombre, String apellido,
			String docuemto, String tipoDocumentos, String fechaDia, String fechaMes, String fechaAño, String sexo) {
		
		super();
		this.email = email;
		this.password = password;
		this.confirmarpassword = confirmarpassword;
		this.nombre = nombre;
		this.apellido = apellido;
		this.docuemto = docuemto;
		this.tipoDocumentos = tipoDocumentos;
		this.fechaDia = fechaDia;
		this.fechaMes = fechaMes;
		this.fechaAño = fechaAño;
		this.sexo = sexo;
	}
	
	public static RegistroUsuario registroUsuario(String email, String password, String confirmarpassword, String nombre, String apellido,
			String docuemto, String tipoDocumentos, String fechaDia, String fechaMes, String fechaAño, String sexo )
	{
return Tasks.instrumented(RegistroUsuario.class, email,password,confirmarpassword,nombre,apellido,
		docuemto,tipoDocumentos,fechaDia,fechaMes,fechaAño,sexo);
		
	}
	
	
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(InicioDafiti.REGISTRO),
				
				Enter.theValue(email).into(RegistrarUsuarioDafiti.EMAIL),
				Enter.theValue(password).into(RegistrarUsuarioDafiti.PASSWORD),
				Enter.theValue(confirmarpassword).into(RegistrarUsuarioDafiti.COMFIRMPASSWORD),
				Enter.theValue(nombre).into(RegistrarUsuarioDafiti.NOMBRE),
				Enter.theValue(apellido).into(RegistrarUsuarioDafiti.APELLIDO),
				Enter.theValue(docuemto).into(RegistrarUsuarioDafiti.DOCUMENTO),
				//Click.on(RegistrarUsuarioDafiti.TIPO_DOCUMENTO),
				//Enter.theValue(tipoDocumentos).into(RegistrarUsuarioDafiti.TIPO_DOCUMENTO),
				SelectFromOptions.byVisibleText("CC").from(RegistrarUsuarioDafiti.LISTA),
				
				Enter.theValue(fechaDia).into(RegistrarUsuarioDafiti.FECHA_DIA),
				Enter.theValue(fechaMes).into(RegistrarUsuarioDafiti.FECHA_MES),
				SelectFromOptions.byVisibleText("1990").from(RegistrarUsuarioDafiti.FECHA_AÑO),
				SelectFromOptions.byVisibleText("Masculino").from(RegistrarUsuarioDafiti.SEXO),
				//Enter.theValue(fechaAño).into(RegistrarUsuarioDafiti.FECHA_AÑO),
				Click.on(RegistrarUsuarioDafiti.ENVIAR));
		
	
		
		
	}

}
