Feature:  Transfer

  @login
  Scenario Outline: Make a transfer successful
    Given un usuario ingresa al sitio de mi banco
    When el usuario <user> se logea con credenciales <pss> validas
    Then el sitio debe mostrar el home con el nombre de usuario correcto <name>
    Examples:
      |user           | pss         |  name     |
      | autoquinito1  | Auto1234    | Joaquin   |