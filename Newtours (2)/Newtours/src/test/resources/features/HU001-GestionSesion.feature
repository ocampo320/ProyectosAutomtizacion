Feature: Gestionar Usuarios en la Aplicacion JPetStore

  Background: Iniciar sesion en la aplicacion JPetStore
    Given He accedido a la pagina de registro de un usuario

  Scenario: Registrar un usuario en la aplicacion JPetStore
    Given He diligenciado la informacion de un nuevo usuario
      | id    | password | name | lastName | email          | telephone | address | city       | state       | postalCode | country |
      | userj |      123 | jose | cano     | juan@gmail.com |   2554273 | cll123  | california | los angeles |       1324 | spain   |
    Then Debe cargar la pagina del catalogo, sin iniciar sesion aun
