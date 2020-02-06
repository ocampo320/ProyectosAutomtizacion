Feature: Buscar informacion servicio
  se desea aprender a manejar preebas de servicios rest

  Scenario Outline: Recuperar informacion de servicio
    Given El <id> en una base de datos
    Then valido <titulo> y <episodio>

    Examples: 
      | id | titulo                 | episodio |
      |  1 | "A New Hope"           |        4 |
      |  5 | "Attack of the Clones" |        2 |
