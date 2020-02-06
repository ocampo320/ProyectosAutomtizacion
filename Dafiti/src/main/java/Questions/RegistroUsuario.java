package Questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class RegistroUsuario implements Question<String> {

	private Target mitarget;

	public RegistroUsuario(Target target) {
		super();
		this.mitarget = target;
	}
/////
	public static RegistroUsuario RegistroUsuario(Target target)
	{
		return new RegistroUsuario(target);
	}

	@Override
	public String answeredBy(Actor actor) {
		return Text.of(target).viewedBy(actor).asString();
	}

}
