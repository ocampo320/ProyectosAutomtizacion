package userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;


@DefaultUrl("https://www.dafiti.com.co/")
public class InicioDafiti extends PageObject {

	public static final Target REGISTRO = Target.the("Selecciona la opción de registro")
			.located(By.xpath("//*[@id=\"LoginInfoTag\"]/span"));
	
	public static final Target EMAIL = Target.the("Selecciona la opción de registro")
			.located(By.xpath("//*[@id=\"LoginForm_email\"]"));
	
	public static final Target CONTRASEÑA = Target.the("Selecciona la opción de registro")
			.located(By.xpath("//*[@id=\"LoginForm_password\"]"));
	
	public static final Target ENVIAR = Target.the("Selecciona la opción de registro")
			.located(By.xpath("//*[@id=\"loginButton\"]"));
	
}
