$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/HU001_RegistrarUsuario.feature");
formatter.feature({
  "name": "Registar un usuario",
  "description": "   Como estudiante de semillero\n  necesito aprender automatizaci�n a traves de ejemplos\n  para automatizar cualquier caso de prueba",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "Ingrese a la pagina",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "name": "Registar usuario en la pagina",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "name": "un usuario se registra con los datos deivi,ocampo,3128389642,deivi320@hotmail,cll8,medellin,antioquia,123,deivi320,deivi123",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "el usuario ve el mensaje de registro exitoso",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "Ingrese a la pagina",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "name": "Iniciar sesion con un usuario",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag2"
    }
  ]
});
formatter.step({
  "name": "El usuario hace login con las credenciales deivi320 y deivi123",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "EL usuario se logea correctamente",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});