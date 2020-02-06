Feature: Iniciar sesion
  en este feature se realizaran los procesos de inicio de sesion agregar contenido 
  al carrito de compra y cerrar sesion.

  Background: Iniciar sesion
    Given se desea iniciar sesion en dafiti
    When con los datos nombre de usuario "jersonandres25@hotmail.com" y contrasena "123456"
    Then validar que si se inicio sesion

  Scenario: Añadir producto al carro de compra
    When anadir al carrito el producto "Reloj Invicta 27350 Oro Negro Silicona, Acero Inoxidable, Poliuretano"
    Then Validar articulo en el carrito de compra

  Scenario: Cerrar sesion
    When se cierra la sesion del usuario
    Then Validar que se cerro la sesion
