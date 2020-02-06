$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/feature/HU001_RegistarDafiti.feature");
formatter.feature({
  "name": ": Registar un usuario",
  "description": "   Como estudiante de semillero\n  necesito aprender automatizaci�n a traves de ejemplos\n  para automatizar cualquier caso de prueba",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "buscar y agregar a carrito",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag3"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Ingrese a la pagina",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitionsDafiti.ingrese_a_la_pagina()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "el usuario se hace una busqueda con los datos bolso",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitionsDafiti.el_usuario_se_hace_una_busqueda_con_los_datos_adidas(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "El usuario ve el mensaje de registro exitoso",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitionsDafiti.el_usuario_ve_el_mensaje_de_registro_exitoso()"
});
formatter.result({
  "status": "passed"
});
});