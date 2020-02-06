package userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class AgregarAlCarritoDafiti {
	
	public static Target SELECIONARPRODUCTO=Target.the("selecciona l producto ")
			.located(By.xpath("//*[@id=\"1:AD859SH91ZZWCO\"]/div/img"));
	
	public static Target TALLAT=Target.the("Seleccion la talla")
			.located(By.xpath("//*[@id=\"OptionsSingleDefault\"]/div[2]/div/span[1]"));
	
	public static Target AGREGARPRODUCTO=Target.the("agrega el producto al carrito")
			.located(By.id("AddToCart"));
	
	

}
