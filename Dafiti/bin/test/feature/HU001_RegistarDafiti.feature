
Feature: : Registar un usuario
   Como estudiante de semillero
  necesito aprender automatización a traves de ejemplos
  para automatizar cualquier caso de prueba

  @tag1
  Scenario: Iniciar sesion con un usuario
    Given Ingrese a la pagina
    When Un usuario se logea con los datos telecentro.lasietrra@gmail.com, 222078
    Then El usuario ve el mensaje de logeo exitoso

  @tag2
  Scenario: Registar usuario en la pagina
    Given Ingrese a la pagina
    When Un usuario se registra con los datos telecentro.lasietrra@gmail.com,2220718,2220718,deibi, ocampo, 1017184574, CE,1, 9, 1990, Masculino
    Then El usuario ve el mensaje de registro exitoso

  @tag3
  Scenario: buscar y agregar a carrito
    Given Ingrese a la pagina
    When el usuario se hace una busqueda con los datos bolso
    Then El usuario ve el mensaje de registro exitoso
    
