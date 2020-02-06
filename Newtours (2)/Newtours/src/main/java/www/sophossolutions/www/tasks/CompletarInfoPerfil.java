package www.sophossolutions.www.tasks;

import com.sophossolutions.www.userinterfaces.PaginaRegistroUsuario;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.conditions.Check;

// Clase
public class CompletarInfoPerfil implements Task {

	// Atributos
	private final String idioma;
	private final String categoria;
	private final boolean habilitarMyList;
	private final boolean habilitarMyBanner;

	// Constructor
	public CompletarInfoPerfil(String idioma, String categoria, String habilitarMyList, String habilitarMyBanner) {
		this.idioma = idioma;
		this.categoria = categoria;
		this.habilitarMyList = habilitarMyList.equals("habilitando");
		this.habilitarMyBanner = habilitarMyBanner.equals("habilitando");
	}

	// Constructor Estático
	public static CompletarInfoPerfil con(String idioma, String categoria, String habilitarMyList,
			String habilitarMyBanner) {
		return Tasks.instrumented(CompletarInfoPerfil.class, idioma, categoria, habilitarMyList, habilitarMyBanner);
	}

	// Método Interfaz
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(SelectFromOptions.byVisibleText(idioma).from(PaginaRegistroUsuario.SELECT_IDIOMA),
				SelectFromOptions.byVisibleText(categoria).from(PaginaRegistroUsuario.SELECT_CATEGORIA),
				Check.whether(habilitarMyList).andIfSo(Click.on(PaginaRegistroUsuario.CHECKBOX_LIST)),
				Check.whether(habilitarMyBanner).andIfSo(Click.on(PaginaRegistroUsuario.CHECKBOX_BANNER)));
	}

}
