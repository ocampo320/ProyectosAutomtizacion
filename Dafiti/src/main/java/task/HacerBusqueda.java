package task;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import userinterfaces.BucarProductoDafiti;
import userinterfaces.RegistrarUsuarioDafiti;

public class HacerBusqueda  implements Task{
	private String buscar;
	
	
	public HacerBusqueda(String buscar) {
		super();
		this.buscar = buscar;
		
	}
	
	public static HacerBusqueda buscarProducto(String buscar)
	{
		return Tasks.instrumented(HacerBusqueda.class, buscar);
		
		
	}


	@Override
	public <T extends Actor> void performAs(T actor) {
		
	actor.attemptsTo(Enter.theValue(buscar).into(BucarProductoDafiti.BUSQUEDAPRODUCTO_TARGET),
			
		Click.on(BucarProductoDafiti.BOTONBUSCAR_TARGET),
	Click.on(BucarProductoDafiti.SELECIONARPRODUCTO_TARGET),
	Click.on(BucarProductoDafiti.SELECIONARCARRITO_TARGET));
		
		
	}

}
