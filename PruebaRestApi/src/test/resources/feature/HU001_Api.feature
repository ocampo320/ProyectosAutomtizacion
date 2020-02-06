#Author: sebas2011561@outlook.es
Feature: Buscar info servicio

  Scenario Outline: Recuperar info servidor
    Given El <id> en una base de datos
    Then Valido <titulo> y <episodio>

    Examples: 
      | id | titulo                 | episodio |
      |  1 | "A New Hope"           |        4 |
      |  5 | "Attack of the Clones" |        2 |
