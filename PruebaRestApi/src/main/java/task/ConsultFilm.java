package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Get;

public class ConsultFilm implements Task{

	private String id;
	
	
	public ConsultFilm(String id) {
		super();
		this.id = id;
	}

	public static ConsultFilm consultar(String id) {
		return Tasks.instrumented(ConsultFilm.class, id);
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Get.resource(id));
		
	}

}
