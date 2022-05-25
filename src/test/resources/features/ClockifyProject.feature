
Feature: Project
  COMO usuario de Clockify
  QUIERO ver los projectos de mi Worckspace
  PARA llevar un control de los mismos

  Scenario Outline: Consulta Projects de Worksapce resultado exitoso
    Given un Api-Key valido
    And un Worspace-id valido
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    And se obtuvo el status code <status>
    Examples:
      | operation | entity  | jsonName   | status |
      | GET       | PROJECT | project/rq | 200    |

  @prueba
  Scenario Outline: Consulta Workspace resultado erroneo

    Given X-Api-Key invalido
    And un Worspace-id valido
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    And se obtuvo el status code <status>
    Then se obtuvo el response esperado en '<entity>' con el '<jsonResponse>'
    Examples:
      | operation | entity | jsonName   | status | jsonResponse   |
      | GET       | ERROR  | project/rq | 401    | project/rs_401 |