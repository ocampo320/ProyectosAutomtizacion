package www.sophossolutions.www.tasks;

// Importaciones Proyecto
import com.sophossolutions.www.userinterfaces.PaginaRegistroUsuario;

// Importaciones Librerías
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;

// Clase
public class DiligenciarInfoCuenta implements Task {

	// Atributos
	private final String nombre;
	private final String apellido;
	private final String email;
	private final String telefono;
	private final String direccion;
	private final String ciudad;
	private final String estado;
	private final String zip;
	private final String pais;

	// Constructor
	public DiligenciarInfoCuenta(String nombre, String apellido, String email, String telefono, String direccion,
			String ciudad, String estado, String zip, String pais) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.telefono = telefono;
		this.direccion = direccion;
		this.ciudad = ciudad;
		this.estado = estado;
		this.zip = zip;
		this.pais = pais;
	}

	// Constructor Estático
	public static DiligenciarInfoCuenta con(String nombre, String apellido, String email, String telefono,
			String direccion, String ciudad, String estado, String zip, String pais) {
		return Tasks.instrumented(DiligenciarInfoCuenta.class, nombre, apellido, email, telefono, direccion, ciudad,
				estado, zip, pais);
	}

	// Método Interfaz
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Enter.theValue(nombre).into(PaginaRegistroUsuario.INPUT_NOMBRE),
				Enter.theValue(apellido).into(PaginaRegistroUsuario.INPUT_APELLIDO),
				Enter.theValue(email).into(PaginaRegistroUsuario.INPUT_EMAIL),
				Enter.theValue(telefono).into(PaginaRegistroUsuario.INPUT_TELEFONO),
				Enter.theValue(direccion).into(PaginaRegistroUsuario.INPUT_DIRECCION),
				Enter.theValue(ciudad).into(PaginaRegistroUsuario.INPUT_CIUDAD),
				Enter.theValue(estado).into(PaginaRegistroUsuario.INPUT_ESTADO),
				Enter.theValue(zip).into(PaginaRegistroUsuario.INPUT_ZIP),
				Enter.theValue(pais).into(PaginaRegistroUsuario.INPUT_PAIS));
	}

}
