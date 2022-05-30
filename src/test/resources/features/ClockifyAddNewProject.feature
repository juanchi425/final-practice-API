@prueba
Feature: Project
  COMO usuario de Clockify
  QUIERO ver los projectos
  PARA llevar un control de los mismos

  Scenario Outline: Consulta Projects  resultado exitoso
    Given un Api-Key valido
    And un Worspace-id valido
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    And se obtuvo el status code <status>
    Examples:
      | operation | entity  | jsonName   | status |
      | GET       | PROJECT | project/rq | 200    |


  Scenario Outline: Consulta Project resultado erroneo,Api-Key Invalido.

    Given X-Api-Key invalido
    And un Worspace-id valido
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    And se obtuvo el status code <status>
    Then se obtuvo el response esperado en <entity> con el <jsonResponse>
    Examples:
      | operation | entity | jsonName   | status | jsonResponse   |
      | GET       | ERROR  | project/rq | 401    | project/rs_401 |


  Scenario Outline: Consulta Project resultado erroneo, endpoint invalido.

    Given un Api-Key valido
    And un Worspace-id valido
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    And se obtuvo el status code <status>
    Then se obtuvo el response esperado

    Examples:
      | operation | entity    | jsonName           | status |
      | GET       | ERROR_404 | project/rqError404 | 404    |

  Scenario Outline: Consulta Project por su ID resultado exitoso.

    Given un Api-Key valido
    And un Worspace-id valido
    And project_id valido
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    And se obtuvo el status code <status>

    Examples:
      | operation | entity     | jsonName             | status |
      | GET       | PROJECT_ID | project/rqProject_ID | 200    |


  Scenario Outline: Modifica Nombre y color del proyecto resultado exitoso

    Given un Api-Key valido
    And un Worspace-id valido
    And project_id valido
    And un nombre del proyecto
    And un color
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    And se obtuvo el status code <status>
    Then se valida que el proyecto fue modificado
    Examples:
      | operation | entity         | jsonName                | status |
      | PUT       | UPDATE_PROJECT | project/rqUpdateProject | 200    |

