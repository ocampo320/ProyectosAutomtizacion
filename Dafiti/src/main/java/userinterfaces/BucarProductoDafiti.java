package userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class BucarProductoDafiti {
	
	public static final Target BUSQUEDAPRODUCTO_TARGET=Target.the("digita en la barra de busca el producto")
			.located(By.xpath("//*[@id=\"searchInput\"]"));
	
	public static final Target BOTONBUSCAR_TARGET=Target.the("hace clic en el boton de buscar lupa")
			.located(By.xpath("//*[@id=\"search\"]/button"));
	
	public static final Target SELECIONARPRODUCTO_TARGET =Target.the("seleciona el producto")
			.located(By.xpath("//*[@id=\"2:SW161AC57MXYCO\"]/div/img"));
	
	
	
//	public static final Target TALLA=Target.the("Seleccion la talla")
//			.located(By.xpath("//*[@id=\"sizesListDropdownTable\"]"));
	
	
	
	public static final Target SELECIONARCARRITO_TARGET=Target.the("agrega al carrito")
			.located(By.xpath("//*[@id=\"AddToCart\"]"));

}
