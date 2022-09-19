Feature:  Login

@login
  Scenario Outline: Login in Mi banco credenciales validas
    Given un usuario se registra en el sitio
    When el usuario <user> se logea con credenciales <pss> validas
    Then el sitio debe mostrar el home con el nombre de usuario correcto <name>
    Examples:
      |user           | pss         |  name     |
      | autoquinito1  | Auto1234    | Joaquin   |
      | autoalexander | Auto1234    | Alexander |

  Scenario: Login in Mi banco credenciales invalidas
    Given un usuario se registra en el sitio
    When el perfil se logea con credenciales invalidas
    Then la web debe mostrar el mensaje usuario invalido



