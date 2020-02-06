Feature: Registrar usuario
  En este espacio se desarrollaran las funcionalidades de registro en Dafiti

  Scenario: Registrar usuario
    Given se desea registrar un usuario en Dafiti
    When Se diligencias los datos de usuario
      | email               | contrasena | nombre        | apellidos | documento  | diaNacimiento | mesNacimiento | anioNacimiento | sexo      |
      | jerson3@hotmail.com |     123456 | jerson andres | jaramillo | 1032456876 |            25 |            04 |           1994 | Masculino |
    Then Validar registro del usuario
