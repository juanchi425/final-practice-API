@prueba
Feature: Project
  COMO usuario de Clockify
  QUIERO ver los projectos
  PARA llevar un control de los mismos

  Scenario Outline: Consulta Projects  resultado exitoso
    Given un Api-Key valido '<key>'
    And un Worspace-id valido '<worspaceId>'
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    And se obtuvo el status code <status>
    Then se valida que los campos nombres no esten vacios
    Examples:
      | operation | entity  | jsonName   | status | key                                              | worspaceId               |
      | GET       | PROJECT | project/rq | 200    | Y2UxNTAyNDYtMmIwYy00ZjM4LWI5NWYtZDFiOTYyYjI0NTkw | 628807ae3bf26277d6055a6e |


  Scenario Outline: Consulta Project resultado erroneo,Api-Key Invalido.

    Given X-Api-Key invalido '<key invalido>'
    And un Worspace-id valido '<worspaceId>'
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    And se obtuvo el status code <status>
    Then se obtuvo el response esperado en <entity> con el <jsonResponse>
    Examples:
      | operation | entity | jsonName   | status | jsonResponse   | key invalido                                   | worspaceId               |
      | GET       | ERROR  | project/rq | 401    | project/rs_401 | Y2UxNTAyNDYtMmIwYy00ZjM4LWI5NWYtZDFiOTYyYjI0NT | 628807ae3bf26277d6055a6e |


  Scenario Outline: Consulta Project resultado erroneo, endpoint invalido.

    Given un Api-Key valido '<key>'
    And un Worspace-id valido '<worspaceId>'
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    And se obtuvo el status code <status>
    Then se obtuvo el response esperado

    Examples:
      | operation | entity    | jsonName           | status | key                                              | worspaceId               |
      | GET       | ERROR_404 | project/rqError404 | 404    | Y2UxNTAyNDYtMmIwYy00ZjM4LWI5NWYtZDFiOTYyYjI0NTkw | 628807ae3bf26277d6055a6e |


  Scenario Outline: Consulta Project por su ID resultado exitoso.

    Given un Api-Key valido '<key>'
    And un Worspace-id valido '<worspaceId>'
    And projectId valido '<projectId>'
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    And se obtuvo el status code <status>
    Then se valida que su Id y nombre no esten vacios

    Examples:
      | operation | entity     | jsonName             | status | key                                              | worspaceId               | projectId                |
      | GET       | PROJECT_ID | project/rqProject_ID | 200    | Y2UxNTAyNDYtMmIwYy00ZjM4LWI5NWYtZDFiOTYyYjI0NTkw | 628807ae3bf26277d6055a6e | 628808eeb5ab6e23f5414258 |
      | GET       | PROJECT_ID | project/rqProject_ID | 200    | Y2UxNTAyNDYtMmIwYy00ZjM4LWI5NWYtZDFiOTYyYjI0NTkw | 628807ae3bf26277d6055a6e | 629528f05703a35a0c389ab8 |
      | GET       | PROJECT_ID | project/rqProject_ID | 200    | Y2UxNTAyNDYtMmIwYy00ZjM4LWI5NWYtZDFiOTYyYjI0NTkw | 628807ae3bf26277d6055a6e | 629529a95703a35a0c389b77 |





