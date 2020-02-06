package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import userinterfaces.AgregarAlCarritoDafiti;



public class AgregarCarrito implements Task {
	
	private String talla;

	public AgregarCarrito(String talla) {
		super();
		this.talla = talla;
	}
	
	public  static AgregarCarrito AgregarCarrito(String talla)
	{
		return Tasks.instrumented(AgregarCarrito.class, talla);
		
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		actor.attemptsTo(SelectFromOptions.byVisibleText("38").from(AgregarAlCarritoDafiti.TALLAT),
				
				Click.on(AgregarAlCarritoDafiti.AGREGARPRODUCTO)
				);
		
		
	}

}
