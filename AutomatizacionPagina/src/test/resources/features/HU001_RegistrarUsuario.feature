Feature: Registar un usuario
   Como estudiante de semillero
  necesito aprender automatización a traves de ejemplos
  para automatizar cualquier caso de prueba
  
  Background:
  	Given   Ingrese a la pagina

  @tag1
  Scenario: Registar usuario en la pagina 
    When    un usuario se registra con los datos deivi,ocampo,3128389642,deivi320@hotmail,cll8,medellin,antioquia,123,deivi320,deivi123   
    Then    el usuario ve el mensaje de registro exitoso
    
    
  @tag2
  Scenario: Iniciar sesion con un usuario
    When    El usuario hace login con las credenciales deivi320 y deivi123
    Then    EL usuario se logea correctamente 
    
    